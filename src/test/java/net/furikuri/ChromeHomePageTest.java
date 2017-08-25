package net.furikuri;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeHomePageTest {

    private WebDriver webDriver;

    @Before
    public void init() {
        webDriver = new ChromeDriver();
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
