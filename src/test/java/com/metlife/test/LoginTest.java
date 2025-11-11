package com.metlife.test;

import com.metlife.base.AutomationWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends AutomationWrapper {

    @Test
    public void validLoginTest() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Logi')]")).click();

        String actualValue = driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick')]")).getText();
        Assert.assertEquals(actualValue, "Quick Launch");
    }

    @Test
    public void invalidLoginTest() {
        driver.findElement(By.name("username")).sendKeys("john");
        driver.findElement(By.name("password")).sendKeys("john123");
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Logi')]")).click();

        String actualError = driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
        Assert.assertEquals(actualError, "Invalid credentials");
    }
}
