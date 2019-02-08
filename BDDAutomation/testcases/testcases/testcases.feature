Feature: Car search functionality
Scenario: Search with valid credentials
Given User is on main page
When User clicks on car header
And User enters pickup location
And User enters drop location
And User click on pickup date calendar
And User choose date for pickup
And User choose time for pickup
And User click on drop date calendar
And User choose date for drop
And User choose time for drop
And User click on search button
Then User logged in successfully