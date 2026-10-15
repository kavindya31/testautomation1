Feature: As a user i need to register to Mercury Tours
  So that i can use its services

  Background: User navigates to Register Page
    Given User is on Home Page --> Register Page

    Scenario: UserRegistration
      Given User enter firstName as "Impirial"
      And User enter lastName as "collage"
      And User enter phone as "1234567678"
      And User enter email as "info@email.lk"
      And User enter country as " SRI LANKA"
      And User enter password as "DemoAdmin"
      And User enter confirm password as "DemoAdmin"
      When User clicks on submit button
      Then salutation message will display as "Dear Impirial collage,"
