Feature: Airbnb

  Scenario Outline: Verify that the results match the search criteria

    Given Open Airbnb Website
    When Click To Close The Popup
    And Click On Anywhere Button Search
    And Insert City In Search "<City>"
    And Click To Choose The City
    And Click To Choose The 7 Day
    And Click To Choose Check-In date
    And Click To Choose Check-Out date
    And Click On Add Guests
    And Click To Choose Number Of Adults
    And Click To Choose Number Of Children
    And Click On Search Button
    And Assert On Count Of Places
    And Choose The Place
    Then Assert On Number Of Guests

















    Examples:

      |    City      | |    |
      |  Rome, Italy | |    |