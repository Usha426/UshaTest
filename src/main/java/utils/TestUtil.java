package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestUtil {
    public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICIT_WAIT = 10;
    WebDriver driver;

    public TestUtil(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookies() {
        this.driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }
}

