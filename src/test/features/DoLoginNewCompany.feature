@DoLoginNewCompany
Feature: Check Login

  Scenario Outline: Do Login New Company Play Online Casino
    Given I open Home
    When I doLogin with thing "<Account>"
    And I click on submit
    And I verify my account
    And I switch Language
    And I choose game and "<Hall>"
    And I close
    Examples:
      | Account        | Hall     |
      | AccPass        | SexyHall |
      | AccPass        | HGHall   |
      | AccFailed_Pass | HGHall   |
      | AccFailed_Acc  | HGHall   |

  Scenario Outline: Do Login Check Browser
    Given I open Home
    When I doLogin with thing "<Account>"
    And I click on submit
    And I verify my account
    And I switch Language
    And I click on funds
    And I select "<From>" "<To>" transfer
    And I choose game and "<Hall>"
    And I close
    Examples:
      | Account | Hall     | From  | To         |
      | AccPass | SexyHall | Poker | IGK Sports |




