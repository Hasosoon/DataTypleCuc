Feature: Delete purchase

  @wip
  Scenario: Delete the lowest one
    Given User logged in the page
    When click on following steps
      | selection | items             |
      | Phones    | Samsung galaxy s6 |
      | Laptops   | Sony vaio i7      |
      | Monitors  | ASUS Full HD      |

    And User clicked "Cart" button
    Then user delete lowest price


