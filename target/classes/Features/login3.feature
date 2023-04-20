Feature: feature to test login functionality

  Scenario Outline: Check whether login is successful with valid credentials or not
    Given mybrowser is opened
    And myuser is on login page
    When myuser enters <username> and <password>
    And myuser clicks on login button
    Then myuser is navigated to the home page

    Examples: |
      | username | password |
      | Tufail   |    12345 |
      | William  |    123451 |
      | Steven   |    123452 |