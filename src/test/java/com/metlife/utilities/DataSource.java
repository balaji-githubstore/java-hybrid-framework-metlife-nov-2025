package com.metlife.utilities;

import org.testng.annotations.DataProvider;

/**
 * This class contains all dataprovider details
 */
public class DataSource {

    @DataProvider
    public Object[][] invalidLoginData()
    {
        Object[][] data=new Object[2][3];

        data[0][0]="saul";
        data[0][1]="saul123";
        data[0][2]="Invalid credentials";

        data[1][0]="kim";
        data[1][1]="kim123";
        data[1][2]="Invalid credentials";

        return data;
    }
}
