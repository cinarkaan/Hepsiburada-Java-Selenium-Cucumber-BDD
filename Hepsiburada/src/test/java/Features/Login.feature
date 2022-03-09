Feature: Login

  """
  As a customer i wanna login to page with correctly.
  """

  #As a customer i wanna login to page and verify log in
  Scenario:LoginWithCorrect
    Given : User will be opened homepage
    When : User will be login "cnrkaan98@gmail.com","CnrKaan0518" to website
    Then : User login will be verified

  #As a customer i wanna login to page with wrong password and check that || Did not write automation of this scenario
  Scenario:LoginWithOnlyEmailCorrect
    Given : User will be opened homepage
    When : User will be login "cnrkaan98@gmail.com","CnrKaan0519" to website

  #As a customer i wanna login to page with wrong email and check that || Did not write automation of this scenario
  Scenario: LoginWithOnlyPasswordCorrect
    Given : User will be opened homepage
    When : User will be login "cnrkaan@gmail.com","CnrKaan0518" to website

  #As a customer i wanna login to page with google and check that || Did not write automation of this scenario
  Scenario: LoginWithGoogleAccount
    Given : User will be opened homepage
    When : User will be clicked sing in with google login
    And : User will be selected account or other account
    And : User will be entered information "<email>","<password>" then log in to page
    Then : User login will be verified

  #As a customer i wanna login to page with apple and check that || Did not write automation of this scenario
  Scenario: LoginWithAppleAccount
    Given : User will be opened homepage
    When : User will be clicked sing in with google login
    And : User will be entered information "<email>","<password>" then log in to page
    Then : User login will be verified

  #As a customer i wanna login to page with facebook and check that || Did not write automation of this scenario
  Scenario: LoginWithFacebookAccount
    Given : User will be opened homepage
    When : User will be clicked sing in with facebook login
    And : User will be entered information "<email>","<password>" then log in to page
    Then : User login will be verified

