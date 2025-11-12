package com.metlife.test;

import com.metlife.base.AutomationWrapper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUITest extends AutomationWrapper {

    @Test(groups = {"regression","smoke"})
    public void titleTest() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "OrangeHRM");
    }

    @Test(groups = {"regression"})
    public void headerTest() {
        String actualHeader = driver.findElement(By.xpath("//h5[contains(normalize-space(),'Log')]")).getText();
        Assert.assertEquals(actualHeader, "Login");
    }
}
