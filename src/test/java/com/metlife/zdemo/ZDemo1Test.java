package com.metlife.zdemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * No need to create - not part of the framework
 *
 */
public class ZDemo1Test {

    @DataProvider
    public Object[][] validData()
    {
        Object[][] data=new Object[3][2];
        //i--> number of testcase
        //j --> number of parameters

        data[0][0]="peter";
        data[0][1]="peter123";

        data[1][0]="john";
        data[1][1]="john123";

        data[2][0]="ken";
        data[2][1]="ken123";

        return data;
    }

    @Test(dataProvider = "validData")
    public void validTest(String username,String password)
    {
        System.out.println("hello "+username+password);
    }
}
