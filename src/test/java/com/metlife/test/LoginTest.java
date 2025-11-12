package com.metlife.test;

import com.metlife.base.AutomationWrapper;
import com.metlife.utilities.DataSource;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends AutomationWrapper {

    @Test(dataProviderClass = DataSource.class,dataProvider = "commonDataProvider")
    public void validLoginTest(String username,String password,String expectedValue) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Logi')]")).click();

        String actualValue = driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick')]")).getText();
        Assert.assertEquals(actualValue, expectedValue);
    }


    @Test(dataProviderClass = DataSource.class,dataProvider = "commonDataProvider")
    public void invalidLoginTest(String username, String password, String expectedError) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Logi')]")).click();

        String actualError = driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
        Assert.assertEquals(actualError, expectedError);
    }
}
