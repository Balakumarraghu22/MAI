Feature: Post a Project
  As a user
  I want to fill in project details and post a project
  So that I can connect with professionals to get proposals for my project

  Scenario: 
    Given I am on the page

  @PositiveFlow
  Scenario: Successfully post a project with valid inputs
    When I enter "Renovate Living Room" as the Project Title
    And I select "Home Improvement" from the Category dropdown
    And I select "Renovation" from the Sub-category dropdown
    And I write "Renovating my living room with modern designs" in the Project Description
    And I upload a valid image in "JPEG" format
    And I select "Range" as the Budget Type
    And I enter "London" as the Project County
    And I set the Starting Date to "01-01-2025"
    And I set the Expiry Date to "31-01-2025"
    And I enter "30" as the Project Duration Days
    And I enter "E1 6AN" as the Post Code
    And I check the "I Agree to the Terms & Conditions" checkbox
    And I click on the "Post Project" button
    Then I should see a confirmation message "Your project has been posted successfully."

  @NegativeFlow
  Scenario: Attempt to post a project with missing mandatory fields
    When I leave the Project Title empty
    And I click on the "Post Project" button
    Then I should see an error message "Project Title is required."

  @Validation
  Scenario: Verify that image upload accepts only supported formats
    When I upload a file "document.pdf"
    Then I should see an error message "Only JPEG, PNG, and JPG formats are supported."

  @Validation
  Scenario: Verify mandatory fields for Posting a Project
    When I leave the Category and Sub-category fields empty
    And I click on the "Post Project" button
    Then I should see error messages:
      | "Category is required."     |
      | "Sub-category is required." |

  @EdgeCase
  Scenario: Attempt to post a project with an invalid postcode
    When I enter "123" as the Post Code
    And I click on the "Post Project" button
    Then I should see an error message "Please enter a v
