@CheckBrowser
Feature: Check Browser

  Scenario Outline: Do Login Check Browser
    Given I open Home please
    When I doLogin with thing "<Account>"
    And I click on submit
    And I verify my account
    And I switch Language
    And I choose game and "<Hall>"
    And I close
    Examples:
      | Account        | Hall     |
      | AccPass        | SexyHall |


   