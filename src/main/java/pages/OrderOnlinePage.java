package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TestUtil;

import java.util.concurrent.TimeUnit;

public class OrderOnlinePage extends BasePage {
    @FindBy(xpath = "//h3[text()='Box Meals']")
    public WebElement boxMealsElem;

    @FindBy(xpath = "//h3[text()=\"Twister Wrap Box Meal with 1 Mini Fillet\"]/following-sibling::button")
    public WebElement addBtnElem;

    @FindBy(css = "button[class=\"sc-kgAjT lnwZbP sc-ksYbfQ cRzxQK\"]")
    public WebElement continueOrderElem;

    @FindBy(css = "button[class=\"sc-kgAjT iVkLrl sc-cJSrbW kfoFQb\"]")
    public WebElement addToMyOrderElem;

    @FindBy(css = "button[class=\"sc-kgAjT eOpPbC sc-cJSrbW kfoFQb\"]")
    public WebElement viewMyOrderElem;


    public OrderOnlinePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnBoxMeals() {
        boxMealsElem.click();
    }

    public void addToBasket() throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        addBtnElem.click();

    }

    public void continueOrder() {
        continueOrderElem.click();

    }

    public void addToMyOrder() {
        addToMyOrderElem.click();
    }

    public void viewMyOrder() {
        viewMyOrderElem.click();
    }
}
