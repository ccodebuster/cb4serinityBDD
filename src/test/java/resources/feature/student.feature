Feature: Testing different request on the student application

  @SMOKE
  Scenario: Check if the student application can be accessed by users
    When User sends a GET request to list endpoint
    Then User must get back a valid status code 200

  @POSITIVE
  Scenario Outline: Create a new student & verify if the student is added
    When I create a new student by providing the information firstName "<firstName>" lastName "<lastName>" email "<email>" programme "<programme>" courses "<courses>"
    Then I verify that the student with "<email>" is created
    Examples:
      | firstName | lastName | email                 | programme        | courses |
      | code1     | buster1  | codebuster1@gmail.com | Computer Science | JAVA    |
      | code2     | buster2  | codebuster2@gmail.com | Api Testing      | Python  |