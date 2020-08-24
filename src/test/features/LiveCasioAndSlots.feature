@LiveCasioAndSlots
Feature: LiveCasio and Slots

  Background: Join LiveCasio and Slots
    Given I open HomePage new UI
    When I check switch Language
    And I click login

  Scenario Outline: Game LiveCasio
    And I login with "<Account>"
    And I click login submit
    And I click game Live Casio
    And I choose Live Casio "<Hall>"
    And I close HomePage
    Examples:
      | Account | Hall         |
      | TonyA   | JulyGaming   |
      | TonyA   | N2Casino     |
      | TonyA   | EvoCasino    |
      | TonyA   | WmCasino     |
      | TonyA   | AllBetCasino |
      | TonyA   | SexyBaccarat |
      | TonyA   | ViVoCasino   |
      | TonyA   | LuckyCasino  |
      | TonyA   | AsiaGaming   |
      | TonyA   | GoldenDelux  |
      | TonyA   | EbetCasino   |
      | TonyA   | VgsCasino    |

  Scenario Outline: Game Slots
    And I login with "<Account>"
    And I click login submit
    And I click game Slots
    And I choose Slots "<Hall>"
    And I close HomePage
    Examples:
      | Account | Hall      |
      | TonyA   | AsiaSlots |
      | TonyA   | Haba      |
      | TonyA   | OneForAll |
