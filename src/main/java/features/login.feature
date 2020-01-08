# new feature
# Tags: optional

Feature: Login Page

  Scenario Outline: Login Successfully
    Given I open website <website>
    When  I input user name as <username>
    And   I submit login
#    Then  I verify login success

    Examples:
      | website                                                                | username     |
      | https://www.way2automation.com/angularjs-protractor/banking/#/customer | Harry Potter |