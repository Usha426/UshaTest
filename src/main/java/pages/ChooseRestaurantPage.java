package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseRestaurantPage extends BasePage {
    @FindBy(css = ".sc-ccLTTT.sc-hlILIN.iBixQs > a > button")
    public WebElement deliveryForCollectionBtn;

    public ChooseRestaurantPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDeliveryForCollection() {
        deliveryForCollectionBtn.click();
    }
}
