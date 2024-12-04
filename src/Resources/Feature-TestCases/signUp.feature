Feature: User Sign-Up on Magento

  Scenario: Successful account creation
    Given the user is on the sign-up page
    When the user provides valid sign-up details
    Then the account should be created successfully
