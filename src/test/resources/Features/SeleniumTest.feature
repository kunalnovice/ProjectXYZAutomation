Feature:some new feature

Scenario: selenium Test Scenario
Given I am on Login Page
When  when I submit valid credentials on Login Page
Then  My Account Page is displayed

Scenario: verify user can reach to Login Page
Given Given I have reached HomePage
Then  I can navigate to Login Page
And I am on Login Page

@trialnot
  Scenario: building Modules
    Given I perform multiple action together
    Then  I perform single action

  @trial
  Scenario: building Modules part two
    Given I perform single action
    Then  I perform multiple action together
