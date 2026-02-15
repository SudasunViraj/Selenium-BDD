@cart
Feature: Cart functionality

  Background:
    Given user is logged in

  Scenario: Add a product to cart
    When user adds product "Sauce Labs Backpack" to the cart
    Then cart badge should show "1"
    And cart should contain product "Sauce Labs Backpack"
