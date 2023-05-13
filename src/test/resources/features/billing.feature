Feature: Billing .feature

  #Not used becuse its return float and double and Int
  # in that case Method Duplication is probleume also known as Ambiguation Probleume
  Scenario Outline: BillingPage
    Given User on Billing Page
    When User enter the billing amount "<BillingAmount>"
    And User enter the Tax amount in "<TaxAmount>"
    And Click on Calculate button
    Then it return  the Final Amount"<FinalAmount>"

    Examples: 
      | BillingAmount | TaxAmount | FinalAmount |
      |           300 |        20 |         320 |
      |           500 |     15.00 |      515.00 |
      |           350 |     .1345 |    351.1345 |
      |           785 |    0.1545 |    785.1545 |
      |          1000 |        20 |        1020 |
