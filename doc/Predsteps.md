# Predefined steps defenition

selenium-cucumber-java comes with the following set of predefined steps.
You can add your own steps or change the ones you see here.

* [Navigation Steps](https://github.com/firashajbi/cucumber_selenium/blob/master/doc/Predsteps.md#navigation-steps)
* [Assertion Steps](https://github.com/firashajbi/cucumber_selenium/blob/master/doc/Predsteps.md#assertion-steps)
* [Input Steps](https://github.com/firashajbi/cucumber_selenium/blob/master/doc/Predsteps.md#input-steps)
* [Click Steps](https://github.com/firashajbi/cucumber_selenium/blob/master/docPredsteps.md#click-steps)
* [Progress Steps](https://github.com/firashajbi/cucumber_selenium/blob/master/doc/Predsteps.md#progress-steps)
* [Screenshot Steps](https://github.com/firashajbi/cucumber_selenium/blob/master/doc/Predsteps.md#screenshot-steps)
* [Configuration Steps](https://github.com/firashajbi/cucumber_selenium/blob/master/doc/Predsteps.md#configuration-steps)


## Navigation Steps

type: "css" "name" "class" "xpath" "id"

To open/close URL and to navigate between pages use following steps :
	I navigate to "URL"
	
	I refresh page
	
	I navigate "forward/backward"
	
To switch between windows use following steps :

	I switch to new window
	
	I switch to previous window
	
	I switch to window having title "title"
	
	I close new window
	
	I switch to main window

To switch between frames use following steps :	

	I switch to frame having "type" "access"
	
	I switch to main content
	
To interact with browser use following steps :    

	I resize browser window size to width int and height int
	
	I maximize browser window
	
	I close browser

To zoom in/out webpage use following steps :

	I zoom in page
	
	I zoom out page

To zoom out webpage till necessary element displays use following steps :

	I zoom out page till I see element having "type" "accessname"
	

To reset webpage view use following step :

	I reset page view

To scroll webpage use following steps :
	
	I scroll to top of page
	
	I scroll to end of page

To scroll webpage to specific element use following steps :

	I scroll to element having "type" "accessname"


To hover over a element use following steps :

	I hover over element having "type" "accessname"


Assertion Steps
---------------
To assert that page title can be found use following step :

	I should "not/" see page title as "title"
	
	I should "not/" see page title having partial text as "partialtext"
  
#### Steps For Asserting Element Text

To assert element text use any of the following steps :

	element having "type" "accessname" should "not/" have text as "(.*?)"

	element having "type" "accessname" should "not/" have partial text as "(.*?)"
	
#### Steps For Asserting Element Attribute

To assert element attribute use any of the following steps : 

	element having "type" "accessname" should "not/" have attribute "(.*?)" with value "(.*?)"
	

#### Steps For Asserting Element Accesibility

To assert that element is enabled or not use any of the following steps :

	element having "type" "accessname" should be enabled
	
#### Steps For Asserting Element Visibility

To assert that element is present or not use any of the following steps :

	element having "type" "accessname" should "not/" be present

#### Steps For Asserting Checkbox

To assert that checkbox is checked use any of the following steps :

	checkbox having "type" "accessname" should be "checked/unchecked"

#### Steps For Asserting Dropdown List

To assert that option by text or value from dropdown list selected or unselected use following steps :

	option "option's text/value" by "text/value" from dropdown having "type" "accessname" should be "selected/unselected"

#### Steps For Asserting Radio Button

To assert that radio button selected use any of the following steps :

	radio button having "type" "accessname" should be "selected/unselected"
	
To assert that radio button group selected by text or value use any of the following steps :

	option "option's text/value" by "text/value" from radio button group having "type" "accessname" should be "selected/unselected"

#### Steps For Asserting Links

To assert that link is present use following steps :

	link having text "text" should "not/" be present
	
	link having partial text "partial text" should "not/" be present

#### Steps For Asserting Javascript Pop-Up Alert 

To assert text on javascipt pop-up alert use following step :

	I should see alert text as "text"

Input Steps
-----------

#### Steps For TextFields

To enter text into input field use following steps :

	I enter "text" into input field having "type" "accessname"

To clear input field use following steps :

	I clear input field having "type" "accessname"
	
#### Steps For Dropdown List :

To select option by text/value/index from dropdown use following steps :

	I select "option's text/value/index" option by "text/value/index" from dropdown having "type" "accessname"



#### Steps For Multiselect List :

To select option by text or value or index from multiselect dropdown use following steps :

	I select "option's text/value/index" option by "text/value/index" from multiselect dropdown having "type" "accessname"

To deselect option by text/value/index from multiselect dropdown use following steps :

	I deselect "option's text/value/index" option by "text/value/index" from multiselect dropdown having "type" "accessname"
		
To deselect all options from multiselect use following steps :

	I deselect all options from mutliselect dropdown having "type" "accessname"

#### Steps For Checkboxes

To check the checkbox use following steps :

	I check the checkbox having "type" "accessname"

To uncheck the checkbox use following steps :

	I uncheck the checkbox having "type" "accessname"
	
To toggle checkbox use following steps

	I toggle checkbox having"type" "accessname"
	
#### Steps For Radio Buttons

To select radio button use following steps :

	I select radio button having "type" "accessname"

To select one radio button by text/value from radio button group use following steps :

	I select "button's text/value" option by "text/value" from radio button group having "type" "accessname"

Click Steps
-----------
To click on web element use following steps :

	I click on element having "type" "accessname"
	
To forcefully click on web element use following steps (if above steps do not work) :

	I forcefully click on element having "type" "accessname"

To double click on web element use following steps :

	I double click on element having "type" "accessname"
	
To click on links use following steps :

	I click on link having text "text"
	
	I click on link having partial text "partial text"

Progress Steps
--------------
To implicitly wait for specific time use following step :

	I wait for "duration" sec
	
To wait for specific element to display use following steps :

	I wait "duration" seconds for element having "type" "accessname" to display

Javascript Handling Steps
-------------------------
To handle javascript pop-up use following steps :

	I accept alert 
	
	I dismiss alert
  

Screenshot Steps 
----------------
To take screenshot use following step :

	I take screenshot "file name"


Configuration Steps
-------------------
To print testing configuration use following step :

	I print configuration
