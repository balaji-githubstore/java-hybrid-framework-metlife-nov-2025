package com.metlife.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public void enterUsername(WebDriver driver, String username)
    {
        driver.findElement(By.name("username")).sendKeys(username);
    }

    public void enterPassword(WebDriver driver, String password)
    {
        driver.findElement(By.name("password")).sendKeys(password);
    }
}
