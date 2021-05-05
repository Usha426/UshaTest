package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Properties;

public class KFCNearMePage extends BasePage {
    private Properties testData;
    @FindBy(css = ".sc-cbkKFq.kCfFDd > input")
    public WebElement searchBox;

    @FindBy(css = ".sc-cMljjf.EROkp > button")
    public WebElement searchButton;


    public KFCNearMePage(WebDriver driver, Properties testData) {
        super(driver);
        this.testData = testData;
    }

    public void enterSearchTerm() {
        searchBox.sendKeys(this.testData.getProperty("searchTerm"));
    }

    public ChooseRestaurantPage clickOnSerchButton() {
        searchButton.click();
        return new ChooseRestaurantPage(this.driver);
    }
}

