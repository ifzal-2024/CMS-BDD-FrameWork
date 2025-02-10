#Author: ifzal.java2024@gmail.com
# Date: 02/04/2025
@login
Feature: Log In
  As an user
  I want to login with my valid credentials to CMS Enterprise Portal
  In order to get access of the Application

  Background: User navigate to Application URL
    Given User is on the CMS Enterprise Portal Homepage URL

  Scenario: Login with valid credentials
    When User enter UserId in the UserId field
    And User enter Password in the Password field
    And User click the check box of I agree to the Terms and Conditions
    And User finally click on Login Button
    Then User will navigate to multi factor authentication modal
