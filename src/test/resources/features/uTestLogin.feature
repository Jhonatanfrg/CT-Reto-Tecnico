# Autor: Jhonatan Felipe Rodríguez Gamba
@stories
Feature: UTest Login
  As a user, i want to create an user in UTest website
  @scenario1
  Scenario: Create an user in UTest Website
    Given than Jhonatan wants to sign in on UTest website
    When he complete the form to sign in as new user
    | strFirstName        | strLastName    | strEmail                  |  strBirthMonth  | strBirthDay | strBirthYear  |  strPassword  |  strConfirmPassword |
    | Andres              | Gamez          | aga31438@gmail.com        |  January        | 10          | 2001          |  Jfrgag1299   |  Jfrgag1299        |
    Then he completes the set up form


