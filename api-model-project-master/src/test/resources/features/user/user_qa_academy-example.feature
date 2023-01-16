#charset: UTF8

@JIRA-002
  Feature: Simple example

    Scenario: Cucumber Example
      Given the user is on the table
      When the user get out
      Then the user should see the window

      Scenario: Simple user post
        Given the user wants to create a new user
        And the user fills field "login" with value equal "janainasilva"
        And the user fills field "full_name" with value equal "janaina Silva"
        And the user fills field "age" with value equal "30"
        And the user fills field "email" with value equal "janainasilva@gmail.com"
        When the user saves see "save with success" message
        Then the user should see "save with success" message




