package com.metlife.test;

import com.metlife.base.AutomationWrapper;
import com.metlife.utilities.DataSource;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmployeeTest extends AutomationWrapper {

    @Test(dataProviderClass = DataSource.class,dataProvider = "commonDataProvider")
    public void addValidLoginTest(String username,String password,String firstName,String middleName,String lastName)
    {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Logi')]")).click();

        //click on PIM menu
        //click on Add Employee

        //enter firstname as jack
        //enter middlename as w
        //enter lastname as wick

        //click on save

        //Assert the profile name - jack wick
        //Assert the firstname texbox has - jack
    }
}
