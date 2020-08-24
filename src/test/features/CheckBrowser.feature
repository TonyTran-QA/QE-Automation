@CheckBrowser
Feature: Check Browser

#  Scenario Outline: Do Login Check Browser
#    Given I open Home
#    When I doLogin with thing "<Account>"
#    And I click on submit
#    And I verify my account
#    And I choose and add "<Banks>"
#    And I switch Language
#    And I click on funds
#    And I select "<From>" "<To>" transfer
#    And I choose "<Amount>" is transfer
#    And I choose game and "<Hall>"
#    And I close
#    Examples:
#      | Account | Hall   | From | To      | Amount | Banks                        |
#      | AccPass | AGHall | Main | AG Hall | 55000  | (SCB)-Ngân hàng TMCP Sài Gòn |

  Scenario Outline: Bet Game Grand Hall
    Given I open Home
    When I doLogin with thing "<Account>"
    And I click on submit
    And I choose game and "<Hall>"
    And I play game
    And I close
    Examples:
      | Account | Hall       |
      | AccPass | Grand Hall |



   