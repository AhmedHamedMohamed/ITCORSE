package Steps;

import Page.AirbnbPage;
import Utilities.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static User.Hooks.webDriver;


public class AirbnbTest {

    AirbnbPage airbnbPage;

    @Given("Open Airbnb Website")
    public void openAirbnbWebsite() throws InterruptedException {
        TestBase.getNewPortalDriver("edge");
        airbnbPage = new AirbnbPage(webDriver);
    }

    @When("Click To Close The Popup")
    public void clickToCloseThePopup() throws InterruptedException {
        airbnbPage.closePopup();
        Thread.sleep(3000);
    }

    @And("Click On Anywhere Button Search")
    public void clickOnAnywhereButtonSearch() {
        airbnbPage.anywhereButtonSearch();

    }

    @And("Insert City In Search {string}")
    public void insertCityInSearch(String City){
        airbnbPage.cityTextSearch(City);
    }

    @And("Click To Choose The City")
    public void clickToChooseTheCity(){
        airbnbPage.chooseCity();
    }

    @And("Click To Choose The 7 Day")
    public void clickToChooseThe7Day() {
        airbnbPage.choose7Day();
    }

    @And("Click To Choose Check-In date")
    public void clickToChooseCheckInDate() {
        airbnbPage.checkInDate();
    }

    @And("Click To Choose Check-Out date")
    public void clickToChooseCheckOutDate(){
        airbnbPage.checkOutDate();
    }

    @And("Click On Add Guests")
    public void clickOnAddGuests() {
        airbnbPage.addGuests();
    }

    @And("Click To Choose Number Of Adults")
    public void clickToChooseNumberOfAdults() {
        airbnbPage.addAdults();
    }

    @And("Click To Choose Number Of Children")
    public void clickToChooseNumberOfChildren() {
        airbnbPage.addChildren();
    }

    @And("Click On Search Button")
    public void clickOnSearchButton() throws InterruptedException {
        airbnbPage.searchButton();
    }

    @And("Assert On Count Of Places")
    public void assertOnCountOfPlaces() throws InterruptedException {
        airbnbPage.countOfPlacesAssertion();
    }

    @And("Choose The Place")
    public void chooseThePlace() {
        airbnbPage.choosePlace(webDriver);
    }

    @Then("Assert On Number Of Guests")
    public void assertOnNumberOfGuests() throws InterruptedException {
        airbnbPage.assertOnNumberOfGuests();
    }
}
