
Feature: validate login of applitools
  check login functionality with username and password

  Scenario Outline: Login validation
    Given open chrome and redirect to applitools website
    When Enter "<username>" and "<password>" 
    Then click submit

    Examples: 
      | username  | password  |
      | anik |  anik123 |
      | ibney | ibney123    |
      | rafiq | rafiq123    |
      