package testcases;

import base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utils.TestUtil;

public class KFCUserJourney extends BaseTest {
    private KFCPage kfcPage;
    private KFCNearMePage kfcNearMePage;
    private ChooseRestaurantPage chooseRestaurantPage;
    private TestUtil util;
    private OrderOnlinePage orderOnlinePage;
    private YourOrderPage yourOrderPage;

    @BeforeMethod
    public void setUp() {
        initialization();
        kfcPage = new KFCPage(driver);
        kfcNearMePage = new KFCNearMePage(driver, testData);
        util = new TestUtil(driver);
        chooseRestaurantPage = new ChooseRestaurantPage(driver);
        orderOnlinePage = new OrderOnlinePage(driver);
        yourOrderPage = new YourOrderPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void searchRestaurant() throws InterruptedException {
        util.acceptCookies();

        kfcPage.findMyKFCStore();

        kfcNearMePage.enterSearchTerm();

        kfcNearMePage.clickOnSerchButton();

        chooseRestaurantPage.clickOnDeliveryForCollection();

        orderOnlinePage.clickOnBoxMeals();

        orderOnlinePage.addToBasket();

        orderOnlinePage.continueOrder();

        orderOnlinePage.addToMyOrder();

        orderOnlinePage.viewMyOrder();

        yourOrderPage.checkProductName();

    }
}
