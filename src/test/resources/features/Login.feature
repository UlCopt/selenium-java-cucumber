Feature: Flow login high priority on Sauce Demo

  Scenario Outline: Login a valid user
    Given I navigate to the Sauce Demo
    When I login with valid credentials <username> and <password>
    Then I enter to the homepage
    Examples:
    |username|password|
    |standard_user|secret_sauce|
    |problem_user|secret_sauce|
