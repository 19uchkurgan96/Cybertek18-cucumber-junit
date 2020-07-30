Feature: Search
  Agile story: As a user , I should be able to search


   Background: User should be on google search page
    Given User is on the google search page


   Scenario: Google default title verification
    Then User should see title is Google


   @wip # work in progress
  Scenario: Google title verification after search
  When User searches apple
  Then User should see apple in the title

     @googleTable
     Scenario: Google search page footer links in the footer
       Then User should see six links in the footer
      |Advertising     |
      |Business        |
      |How Search Works|
      |Privacy         |
      |Terms           |
      |Settings        |

















