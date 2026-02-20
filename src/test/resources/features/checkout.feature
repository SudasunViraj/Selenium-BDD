@e2e @checkout
Feature: Checkout flow

  Background:
    Given user is logged in

  Scenario: Complete checkout with valid details
    When user adds product "Sauce Labs Backpack" to the cart
    And user opens the cart
    And user proceeds to checkout
    And user enters checkout details
      | firstName | John  |
      | lastName  | Doe   |
      | postalCode| 10001 |
    And user completes the checkout
    Then order confirmation message should be displayed