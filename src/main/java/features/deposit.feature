Feature: Deposit Page

  Scenario Outline: Login Successfully
    Given I open website <website>
    When  I input deposit as <deposit>
#    And   I submit deposit
#    Then  I verify deposit

    Examples:
      | website                                                               | deposit |
      | http://www.way2automation.com/angularjs-protractor/banking/#/customer | 2000    |
