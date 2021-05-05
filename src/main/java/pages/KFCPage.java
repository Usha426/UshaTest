package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;
import utils.TestUtil;

import java.util.concurrent.TimeUnit;

public class KFCPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//*[@id='__next']/div[1]/main/div[1]/div/div/div/ul/li[2]/div/div[2]/div/div/div/div[2]/a/button")
    public WebElement findaKFCBtn;
    @FindBy(how = How.ID, using = "onetrust-accept-btn-handler")
    public WebElement cookiesBtn;

    public KFCPage(WebDriver driver) {
        super(driver);
    }

    public void findMyKFCStore() {
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        findaKFCBtn.click();
    }
}

