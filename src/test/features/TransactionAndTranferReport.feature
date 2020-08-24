@TransactionAndTranferReport
Feature: Transaction Report and Tranfer Report and View Deposit & Withdrawal History
  Background: Always open HomePage
    Given I open HomePage new UI
    When I check switch Language
    And I click login

  Scenario Outline: Transaction Report
    And I login with "<Account>"
    And I click login submit
    And I view transaction report
    And I choose date from
    And I choose date to
    And I close HomePage
    Examples:
      | Account |
      | TonyA   |

  Scenario Outline: Tranfer Report
    And I login with "<Account>"
    And I click login submit
    And I view tranfer report
    And I close HomePage
    Examples:
      | Account |
      | TonyA   |

  Scenario Outline: View Deposit & Withdrawal History
    And I login with "<Account>"
    And I click login submit
    And I view deposit & withdrawal history
    And I choose date from
    And I choose date to
    And I close HomePage
    Examples:
      | Account |
      | TonyA   |
