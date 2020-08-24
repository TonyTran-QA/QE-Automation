@PokerAndLotteryAndCockFight
Feature: PokerAndLotteryAndCockFight

  Background: Join Poker And Lottery And CockFight
    Given I open HomePage new UI
    When I check switch Language
    And I click login

  Scenario Outline: Poker
    And I login with "<Account>"
    And I click login submit
    And I click game Poker
    And I choose Poker "<Hall>"
    And I close HomePage
    Examples:
      | Account | Hall     |
      | TonyA   | IDNPoker |

  Scenario Outline: Lottery
    And I login with "<Account>"
    And I click login submit
    And I click game Lottery
    And I choose Lottery "<Hall>"
    And I close HomePage
    Examples:
      | Account | Hall      |
      | TonyA   | Vlote     |
      | TonyA   | Lottery39 |

  Scenario Outline: CockFight
    And I login with "<Account>"
    And I click login submit
    And I click game CockFight
    And I choose CockFight "<Hall>"
    And I close HomePage
    Examples:
      | Account | Hall  |
      | TonyA   | SV388 |
      | TonyA   | S128  |