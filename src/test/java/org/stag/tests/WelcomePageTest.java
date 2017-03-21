package org.stag.tests;

import org.openqa.selenium.By;
import org.stag.components.GalenTestBase;
import org.testng.annotations.Test;

import java.io.IOException;


public class WelcomePageTest extends GalenTestBase {

    @Test(dataProvider = "devices")
    public void welcomePage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        System.out.println(device.getTags());
        load("/");
        checkLayout("/specs/welcomePage.gspec", device.getTags());
    }
}
