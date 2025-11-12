package com.metlife.utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * This class contains all test data of dataprovider
 */
public class DataSource {

    @DataProvider
    public Object[][] invalidLoginData() {
        Object[][] data = new Object[2][3];

        data[0][0] = "saul";
        data[0][1] = "saul123";
        data[0][2] = "Invalid credentials";

        data[1][0] = "kim";
        data[1][1] = "kim123";
        data[1][2] = "Invalid credentials";

        return data;
    }

    @DataProvider
    public Object[][] commonDataProvider(Method method) throws IOException {
        //Get Current @Test method name and pass it as sheetname
        //current @Test method name is the sheet name
        String testMethodName= method.getName();
        Object[][] data = ExcelUtils.getSheetIntoTwoDimensionalArray("test-data/orange-hrm-data.xlsx", testMethodName);
        return data;
    }
}
