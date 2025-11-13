package com.metlife.test;

import com.metlife.base.AutomationWrapper;
import com.metlife.pages.LoginPage;
import com.metlife.utilities.DataSource;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmployeeTest extends AutomationWrapper {

    @Test(dataProviderClass = DataSource.class,dataProvider = "commonDataProvider",groups = {"regression"})
    public void addValidLoginTest(String username,String password,String firstName,String middleName,String lastName)
    {
        LoginPage login=new LoginPage();
        login.enterUsername(driver,username);
        login.enterPassword(driver,password);
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
