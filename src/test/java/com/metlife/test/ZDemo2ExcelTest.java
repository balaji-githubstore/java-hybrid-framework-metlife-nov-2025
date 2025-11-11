package com.metlife.test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ZDemo2ExcelTest {

    public static void main(String[] args) throws IOException {

        FileInputStream file=new FileInputStream("test-data/orange-hrm-data.xlsx");

        XSSFWorkbook book=new XSSFWorkbook(file);

        XSSFSheet sheet= book.getSheet("invalidLoginTest");

        String value=sheet.getRow(1).getCell(0).getStringCellValue();
        System.out.println(value);

    }
}
