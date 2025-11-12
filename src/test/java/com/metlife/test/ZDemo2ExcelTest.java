package com.metlife.test;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * Not part of the framework
 *
 */
public class ZDemo2ExcelTest {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("test-data/orange-hrm-data.xlsx");
        XSSFWorkbook book = new XSSFWorkbook(file);
        XSSFSheet sheet = book.getSheet("invalidLoginTest");

        int rowCount=sheet.getPhysicalNumberOfRows();
        int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data=new Object[rowCount-1][cellCount];
        DataFormatter formatter=new DataFormatter();

        for (int r = 1; r < rowCount; r++) {
            for (int c = 0; c < cellCount; c++) {
                data[r-1][c]=formatter.formatCellValue(sheet.getRow(r).getCell(c));
            }
        }

        System.out.println();


    }
}
