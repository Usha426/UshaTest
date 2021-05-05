package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.TestUtil;

import java.util.concurrent.TimeUnit;

public class YourOrderPage extends BasePage {
    @FindBy(css = "p[class='sc-fjdhpX iOsOBM sc-daURTG kQbvty']>b")
    public WebElement productNameElem;

    String expectedProductName = "1 x Twister Wrap Box Meal with 1 Mini Fillet";

    public YourOrderPage(WebDriver driver) {
        super(driver);
    }

    public void checkProductName() {
        driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        String orderedItem = productNameElem.getText();
        System.out.println("Price of the item" + orderedItem);
        Assert.assertEquals(orderedItem, expectedProductName);
    }
}

