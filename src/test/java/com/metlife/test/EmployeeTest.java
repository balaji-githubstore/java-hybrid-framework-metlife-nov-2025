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
        LoginPage login = new LoginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickOnLogin();

        //MainPage
        //click on PIM menu

        //PIMPage
        //click on Add Employee

        //AddEmployeePage
        //enter firstname as jack
        //enter middlename as w
        //enter lastname as wick
        //click on save

        //PersonalDetailPage
        //Assert the profile name - jack wick
        //Assert the firstname texbox has - jack
    }
}
