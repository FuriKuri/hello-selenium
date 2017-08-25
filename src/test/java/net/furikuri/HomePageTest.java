package net.furikuri;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HomePageTest {

    private WebDriver webDriver;

    @Before
    public void init() {
        DesiredCapabilities firefox = DesiredCapabilities.firefox();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addCapabilities(firefox);
        webDriver = new FirefoxDriver(firefoxOptions);
    }

    @After
    public void cleanUp() {
        webDriver.close();
    }

    @Test
    public void openHomePage() {
        webDriver.get("https://furikuri.net");
        String title = webDriver.getTitle();
        assertEquals("Hello World", title);
    }

}
