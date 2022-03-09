Feature: AddProductToBasket

  """
    As a customer i wanna add any product to order cart with login and without login.
  """

  #As a customer i wanna add any product to order cart with login to page
  Scenario: AddProductWithLogin
    Given : User will be opened homepage
    When : User will be login "cnrkaan98@gmail.com","CnrKaan0518" to website
    And : User login will be verified
    And : User will be "laptop" searched any product for buy
    Then : User will be selected two product from different users
    Then : Selected products will be verified from orders

  #As a customer i wanna add any product to order cart without login to page
  Scenario: AddProductWithoutLogin
    Given : User will be opened homepage
    And : User will be "laptop" searched any product for buy
    And : User will be selected two product from different users
    Then : Selected products will be verified from orders

