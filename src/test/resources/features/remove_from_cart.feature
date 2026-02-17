@cart
Feature: Remove from cart

  Background:
    Given user is logged in

  Scenario: Remove a product from cart
    When user adds product "Sauce Labs Backpack" to the cart
    And user opens the cart
    And user removes product "Sauce Labs Backpack" from the cart
    Then cart badge should not be displayed