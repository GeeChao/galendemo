package org.stag.tests;

import org.openqa.selenium.By;
import org.stag.components.GalenTestBase;
import org.testng.annotations.Test;

import java.io.IOException;


public class LoginPageTest extends GalenTestBase {

    @Test(dataProvider = "devices")
    public void loginPage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        load("/");
        getDriver().findElement(By.xpath("//button[.='Login']")).click();
        checkLayout("/specs/loginPage.gspec", device.getTags());
    }

    @Test(dataProvider = "devices")
    public void loginPageWithErrorMessage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        load("/");
        getDriver().findElement(By.xpath("//button[.='Login']")).click();
        getDriver().findElement(By.name("login.username")).sendKeys("FakeUser");
        getDriver().findElement(By.name("login.password")).sendKeys("FakePassword");
        getDriver().findElement(By.xpath("//button[.='Login']")).click();
        checkLayout("/specs/loginPage-withErrorMessage.gspec", device.getTags());
    }

}
