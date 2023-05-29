package Page;

import User.WebPageBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AirbnbPage extends WebPageBase {


    public AirbnbPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/header/div/div[2]/div[1]/div/button[1]/div")
    public WebElement anywhereButtonSearch;

    @FindBy(id = "bigsearch-query-location-input")
    public WebElement cityTextSearch;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/header/div/div[2]/div[2]/div/div/div/form/div[2]/div/div[1]/div/div[2]/div/section/div/div/div/div[1]")
    public WebElement chooseCity;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/header/div/div[2]/div[2]/div/div/div/form/div[2]/div/div[3]/div[2]/div/div/section/div/div/div/div/div[2]/div[1]/div/div[2]/div[2]/div[5]/label")
    public WebElement choose7Days;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/header/div/div[2]/div[2]/div/div/div/form/div[2]/div/div[3]/div[2]/div/div/section/div/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[2]/div")
    public WebElement checkInDate;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/header/div/div[2]/div[2]/div/div/div/form/div[2]/div/div[3]/div[4]/div/div/section/div/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[2]/div[2]/div/div[3]/div/table/tbody/tr[2]/td[2]/div")
    public WebElement checkOutDate;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/header/div/div[2]/div[2]/div/div/div/form/div[2]/div/div[5]/div[1]/div[1]/div/div[2]")
    public WebElement addGuests;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/header/div/div[2]/div[2]/div/div/div/form/div[2]/div/div[5]/div[2]/div/div/div/section/div/div/div/div[1]/div[2]/div/button[2]")
    public WebElement addAdults;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/header/div/div[2]/div[2]/div/div/div/form/div[2]/div/div[5]/div[2]/div/div/div/section/div/div/div/div[2]/div[2]/div/button[2]")
    public WebElement addChildren;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/header/div/div[2]/div[2]/div/div/div/form/div[2]/div/div[5]/div[1]/div[3]/button/span[1]/span")
    public WebElement searchButton;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[2]/div/div/div/div/div/div[2]/main/div[2]/div/div[1]/div/div/section/h1/span")
    public WebElement countOfPlacesAssertion;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div/div[2]/div/div/div/div[1]/main/div/div[1]/div[3]/div/div[1]/div/div[1]/div/div/section/div/div/div[1]/ol/li[1]/span[1]")
    public WebElement assertOnNumberOfGuests;






    public void closePopup() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveByOffset(0, 0).click().build().perform();

    }

    public void anywhereButtonSearch(){
        anywhereButtonSearch.click();
    }

    public void cityTextSearch(String City) {
        cityTextSearch.sendKeys(City);
    }

    public void chooseCity(){
        chooseCity.click();
    }

    public void choose7Day() {
        choose7Days.click();
    }

    public void checkInDate(){
        checkInDate.click();
    }

    public void checkOutDate(){
        checkOutDate.click();
    }

    public void addGuests(){
        addGuests.click();

    }

    public void addAdults(){
        addAdults.click();
        addAdults.click();
    }

    public void addChildren(){
        addChildren.click();
    }

    public void searchButton() throws InterruptedException {
        Thread.sleep(3000);
        searchButton.click();
    }

    public void countOfPlacesAssertion() throws InterruptedException {
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        String ExpectedText = "Search results\n" +
                "Over 1,000 places";
        String ActualText = countOfPlacesAssertion.getText();
        softAssert.assertEquals(ActualText,ExpectedText,"Title is not Matching");
        softAssert.assertAll();
        Thread.sleep(2000);
    }

    public void choosePlace(WebDriver webDriver){
        driver.navigate().to("https://www.airbnb.com/rooms/7533500?adults=2&children=1&enable_m3_private_room=true&infants=0&pets=0&check_in=2023-06-05&check_out=2023-06-09&federated_search_id=d8a5affb-660a-41db-8f98-2ed707acaf97&source_impression_id=p3_1685389684_Yj0reQpxH9IgA9sJ");
    }

    public void assertOnNumberOfGuests() throws InterruptedException {
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        String ExpectedText = "3 guests";
        String ActualText = assertOnNumberOfGuests.getText();
        softAssert.assertEquals(ActualText,ExpectedText,"Title is not Matching");
        softAssert.assertAll();

    }
}
