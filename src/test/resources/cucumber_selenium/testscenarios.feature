Feature: UI test
  testing selenium stepdefs using herokuapp a website powered by selenium


  Scenario: I search in google for Internet heroku app
    Given I navigate to "https://www.google.com"
    And I wait for "2" sec
    When I enter "internet herokuapp" into input field having "name" "q"
    Then I press enter in "name" "q"
    And I take screenshot "herokuappsearch"



  Scenario: I login with valid credential
    Given I navigate to "http://the-internet.herokuapp.com/login"
    And I take screenshot "Login page"
    And I enter "tomsmith" into input field having "id" "username"
    And I enter "SuperSecretPassword!" into input field having "id" "password"
    When I click on element having "class" "radius"
    Then I wait "10" seconds for element having "css" "a[href='/logout']" to display
    And I take screenshot "logged in"



  Scenario: I login with fake username 
    Given I navigate to "http://the-internet.herokuapp.com/login"
    And I enter "firas" into input field having "id" "username"
    And I enter "firaspass" into input field having "id" "password"
    When I click on element having "class" "radius"
    Then I take screenshot "fake username"



  Scenario: I login with wrong password 
    Given I navigate to "http://the-internet.herokuapp.com/login"
    And I enter "tomsmith" into input field having "id" "username"
    And I enter "worngpass" into input field having "id" "password"
    When I click on element having "class" "radius"
    Then I take screenshot "Wrong password"



  Scenario: I test clicking ADD/REMOVE functionality
    Given I navigate to "http://the-internet.herokuapp.com/"
    And I click on element having "xpath" "/html/body/div[2]/div/ul/li[2]/a" 
    When I wait "10" seconds for element having "class" "example" to display
    And element having "xpath" "/html/body/div[2]/div/h3" should "" have text as "Add/Remove Elements"
    And I take screenshot "adddelete page"
    Then I click on element having "xpath" "/html/body/div[2]/div/div/button"
    And I take screenshot "add"
    And I wait for "2" sec
    And I click on element having "class" "added-manually"
    And I take screenshot "delete"



  Scenario: I test checkboxes
    Given I navigate to "http://the-internet.herokuapp.com/"
    And I click on element having "xpath" "/html/body/div[2]/div/ul/li[6]/a"
    When I wait "10" seconds for element having "class" "example" to display
    And element having "xpath" "/html/body/div[2]/div/div/h3" should "" have partial text as "Checkboxes"
    And I take screenshot "checkboxes"
    Then checkbox having "xpath" "/html/body/div[2]/div/div/form/input[2]" should be "checked"
    And checkbox having "xpath" "/html/body/div[2]/div/div/form/input[1]" should be "unchecked"
    And I check the checkbox having "xpath" "/html/body/div[2]/div/div/form/input[1]"
    And I uncheck the checkbox having "xpath" "/html/body/div[2]/div/div/form/input[2]"
    And I take screenshot "check_uncheck"
