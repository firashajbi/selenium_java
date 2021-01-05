cucumber-selenium
=================

BDD UI-testing:
-----------------

selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web.
It enables you to write and execute automated acceptance/unit tests.
It is cross-platform, open source and free.
Automate your test cases with minimal coding.
[More Details](http://seleniumcucumber.info/)

Documentation:
-----------------

* [Installation](doc/installation.md)
* [Predefined steps](doc/Predsteps.md)

Writing a test:
-----------------

The cucumber features goes in the `features` library and should have the ".feature" extension.

There is a scenario in scenario_not_in_use `features/wlcm.feature`. You can extend this feature or make your own features using some of the [predefined steps](doc/predsteps.md).

Running test:
-----------------

* mvn test 


