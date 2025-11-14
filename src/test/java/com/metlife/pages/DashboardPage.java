package com.metlife.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private final WebDriver driver;

    public DashboardPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public String getQuickLaunchText()
    {
        return  driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick')]")).getText();
    }
}
