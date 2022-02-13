Feature: Flow Checkout high priority on Sauce Demo

  Background:
    Given I navigate to the Sauce Demo

  Scenario Outline: Checkout one product successfully
    When I login with valid credentials <username> and <password>
    Then I select a product by the <index> to checkout and process put the information <firstName> <lastName> <postalCode>
    And The checkout is successful
    Examples:
      |username|password|index|firstName|lastName|postalCode|
      |standard_user|secret_sauce|2|cris|llon    |0000999   |

