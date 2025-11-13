package com.metlife.test;

import com.metlife.base.AutomationWrapper;
import com.metlife.pages.LoginPage;
import com.metlife.utilities.DataSource;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends AutomationWrapper {

    @Test(dataProviderClass = DataSource.class,dataProvider = "commonDataProvider",groups = {"regression","smoke"})
    public void validLoginTest(String username,String password,String expectedValue) {

        LoginPage login=new LoginPage();
        login.enterUsername(driver,username);
        login.enterPassword(driver,password);

        driver.findElement(By.xpath("//button[contains(normalize-space(),'Logi')]")).click();

        String actualValue = driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick')]")).getText();
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test(dataProviderClass = DataSource.class,dataProvider = "commonDataProvider",groups = {"regression"})
    public void invalidLoginTest(String username, String password, String expectedError) {

        LoginPage login=new LoginPage();
        login.enterUsername(driver,username);
        login.enterPassword(driver,password);

        driver.findElement(By.xpath("//button[contains(normalize-space(),'Logi')]")).click();

        String actualError = driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
        Assert.assertEquals(actualError, expectedError);
    }
}
