Feature: Registration of TestMeApp


Background: 
Given user logged to the Testme app application

  @Regression
  Scenario Outline: User Registration
    
    When user provides username as '<user>'
    And password as '<password>'
    Then user registration is successful
    
    Examples:
    |user|password|
    |lalitha|Password123|
    |Peter|paker|
    
    