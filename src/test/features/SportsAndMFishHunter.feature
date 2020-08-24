@SportsAndMFishHunter
Feature: Sports and MFishHunter

  Background: Join Sports and MFishHunter
    Given I open HomePage new UI
    When I check switch Language
    And I click login

  Scenario Outline: Game Sports
    And I login with "<Account>"
    And I click login submit
    And I click game Sports
    And I choose Sports "<Hall>"
    And I close HomePage
    Examples:
      | Account | Hall       |
      | TonyA   | M8Sport    |
      | TonyA   | AsiaSport  |
      | TonyA   | IGKSport   |
      | TonyA   | LuckySport |
      | TonyA   | ISNSport   |

  Scenario Outline: Game MFishHunter
    And I login with "<Account>"
    And I click login submit
    And I click game MFishHunter
    And I choose MFishHunter "<Hall>"
    And I close HomePage
    Examples:
      | Account | Hall          |
      | TonyA   | DragonHunter  |
      | TonyA   | FishHunter    |
      | TonyA   | SpaceCat      |
      | TonyA   | GoldenDragon  |
      | TonyA   | AirCombat     |
      | TonyA   | ThreeKingdoms |