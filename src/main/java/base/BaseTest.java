package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Constants;
import utils.PropertyFileReader;
import utils.TestUtil;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public static Properties configProp, testData;

    static {
        configProp = new PropertyFileReader().getProperty(Constants.CONFIG_FILE_PATH);
        testData = new PropertyFileReader().getProperty(Constants.TEST_DATA_FILE_PATH);
    }

    public void initialization() {
        String browserName = configProp.getProperty("browser");
        if (browserName.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/geckodriver");
            driver = new FirefoxDriver();
        } else if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(configProp.getProperty("url"));
    }

}
