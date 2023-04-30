Feature: Ruleguard demo
  As a candidate I am showing interviewer my framework

  Scenario: As a user I am chekcing home page
    Given   I am on home page
    When    I verify logo is present or not
    And     I hover mouse on Solutions tab
    And     I hover and click on TASKS & CHECKLISTS
    Then    I verify the tile of the page "GRC Management Software | Ruleguard"
