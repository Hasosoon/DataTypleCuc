Feature: Purchase

  Background:
    Given User logged in the page

  @wip
  Scenario Outline: Buying items
    And click on "<selection>" button
    When "<items>" are selected
    And "Add to cart" selected items
    Then user should see the same "<total price>" in cart and Dashboard page


    Examples:
      | selection | items             | total price |
      | Phones    | Samsung galaxy s6 | 360         |
      | Laptops   | Sony vaio i7      | 1150        |
      | Monitors  | ASUS Full HD      | 1380        |