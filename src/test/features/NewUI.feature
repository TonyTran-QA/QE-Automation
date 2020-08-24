@NewUI
Feature: UI New

  Background: Always open HomePage
    Given I open HomePage new UI
    When I check switch Language

  Scenario Outline: UI NEW Page Join Now
    And I click join now
    And I send "<Referral>" code
    And I sign in with "<Username>"
    And I confirm password and next steps
    And I fill infor "<Personal>" information
    And I fill OTP
    And I back to Home
    And I verify account has just been registered
    And I close HomePage
    Examples:
      | Referral | Username | Personal |
      | Null     | TonyA    | TonyA    |
      | Null     | TonyB    | TonyB    |
      | Code1    | TonyC    | TonyC    |
      | Null     | TonyD    | TonyD    |
      | Code2    | TonyE    | TonyE    |

  Scenario Outline: Check Login
    And I click login
    And I login with "<Account>"
    And I click login submit
    And I verify my account has just been login
    And I check my profile
    And I add my bank account with name "<Bank>"
    And I close HomePage
    Examples:
      | Account | Bank        |
      | TonyA   | SACOMBANK   |
      | TonyB   | TECHCOMBANK |
      | TonyC   | VIETCOMBANK |
      | TonyD   | VIETINBANK  |
      | TonyE   | MBBANK      |

  Scenario Outline: Recharge account And Withdraw money
    And I click login
    And I login with "<Account>"
    And I click login submit
    And I verify account has just been login
    And I choose "<Bank>" recharge
    And I choose "<Transfer>"
    And I click recharge account and sent "<Amount>"
    And I choose Deposit without promotion And Select promotion "<Chess>"
    And I close HomePage
    Examples:
      | Account | Amount | Transfer | Bank        | Chess         |
      | TonyA   | 1000   | 1        | SACOMBANK   | NotPromotion  |
      | TonyB   | 2000   | 2        | TECHCOMBANK | TruePromotion |
      | TonyC   | 3000   | 3        | VIETCOMBANK | TruePromotion |
      | TonyD   | 4000   | 4        | VIETINBANK  | NotPromotion  |
      | TonyE   | 5000   | 5        | MBBANK      | NotPromotion  |

  Scenario Outline: Withdraw money
    And I click login
    And I login with "<Account>"
    And I click login submit
    And I process Withdraw money
    And I close HomePage
    Examples:
      | Account |
      | TonyA   |
      | TonyB   |
      | TonyC   |
      | TonyD   |
      | TonyE   |

  Scenario Outline: Main Balance
    And I click login
    And I login with "<Account>"
    And I click login submit
    And I click wallet
    And I choose one option in three "<Option>"
    And I close HomePage
    Examples:
      | Account | Option  |
      | TonyA   | FundIn  |
      | TonyB   | FundIn  |
      | TonyC   | FundOut |
