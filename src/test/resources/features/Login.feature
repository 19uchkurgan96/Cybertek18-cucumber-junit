@ogin
Feature: Login feature
 CBT-25:  Agile Story : As a user , I should be able to login with correct credentials to different accounts,and dashboard should be displayed

  @librarian
  Scenario: Librarian login scenario
    Given User is on the login page
    When User logs in as librarian
    Then User should see dashboard

    @student
    Scenario: Student login scenario
      Given User is on the login page
      When User logs in as student
      Then User should see dashboard

      @admin
      Scenario: Admin login scanerio
        Given User is on the login page
        When User logs in as admin
        Then User should see dashboard
