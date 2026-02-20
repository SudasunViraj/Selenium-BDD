@regression
Feature: Add multiple products to cart

  Background:
    Given user is logged in

  Scenario: Add two products and verify cart count
    When user adds product "Sauce Labs Backpack" to the cart
    And user adds product "Sauce Labs Bike Light" to the cart
    Then cart badge should show "2"