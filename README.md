# Hepsiburada Test Automation

    Requirements : Java,Selenium,ChromeDriver,EdgeDriver

    Feature : AddProductOrderCart

    Case 1 : AddProductWithLogin

    Given : User will be opened homepage
    When : User will be login "<email>","<pass>" to website
    And : User login will be verified
    And : User will be "<item>" searched any product for buy
    Then : User will be selected two product from different users
    Then : Selected products will be verified from orders


    Case2 : AddProductWithoutLogin
    
    Given : User will be opened homepage
    And : User will be "<item>" searched any product for buy
    And : User will be selected two product from different users
    Then : Selected products will be verified from orders
 
    Feature : Login  
    
    Scenario:LoginWithCorrect
    Given : User will be opened homepage
    When : User will be login "cnrkaan98@gmail.com","CnrKaan0518" to website
    Then : User login will be verified

    Scenario:LoginWithOnlyEmailCorrect /// DID NOT WRITE TEST AUTOMATION CODE ONLY BDD
    Given : User will be opened homepage
    When : User will be login "cnrkaan98@gmail.com","CnrKaan0519" to website

    Scenario: LoginWithOnlyPasswordCorrect /// DID NOT WRITE TEST AUTOMATION CODE ONLY BDD
    Given : User will be opened homepage
    When : User will be login "cnrkaan@gmail.com","CnrKaan0518" to website
 
    Scenario: LoginWithGoogleAccount /// DID NOT WRITE TEST AUTOMATION CODE ONLY BDD
    Given : User will be opened homepage
    When : User will be clicked sing in with google login
    And : User will be selected account or other account
    And : User will be entered information "<email>","<password>" then log in to page
    Then : User login will be verified

    Scenario: LoginWithAppleAccount /// DID NOT WRITE TEST AUTOMATION CODE ONLY BDD
    Given : User will be opened homepage
    When : User will be clicked sing in with google login
    And : User will be entered information "<email>","<password>" then log in to page
    Then : User login will be verified

  
    Scenario: LoginWithFacebookAccount /// DID NOT WRITE TEST AUTOMATION CODE ONLY BDD
    Given : User will be opened homepage
    When : User will be clicked sing in with facebook login
    And : User will be entered information "<email>","<password>" then log in to page
    Then : User login will be verified
 
    Videos(Chrome/Edge)
    
    Edge

    https://user-images.githubusercontent.com/55651776/157424780-4f404d06-67f7-4a72-a105-d83faaebc616.mp4

    
  
  

  
  
