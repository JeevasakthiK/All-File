Feature: Validate The functionality Of Adactin Hotel Booking Application
Scenario: Login Page
Given User Launch The Application
When User Enter The Username In The Username Field
And User Enter The Password In The Password Field
Then User Click The Login button and its Redirects To The Search Hotel Page

Scenario: Search Hotel
When User Select The Location In The Location Dropdown
And User Select The Hotel In The Hotels Dropdown
And User Select The Room Type In The Room Type Dropdown
And User Select The Number Of Rooms In The Number Of Rooms Dropdown
And User Enter The Check In Date In The Check In Date Field
And User Enter The Check Out Date In The Check Out Date Field
And User Select The Adults Per Room In The Adults Per Room Dropdown  
And User Select The Children Per Room In The children Per Room Dropdown
Then User Click The Search button and its Redirects To The Select Hotel Page

Scenario: Select Hotel
When User Select The Radio button In The Select Column
Then User Click The Continue button and its Redirect To The Book A Hotel Page

Scenario: Book A Hotel
When User Enter The First Name In The First Name Field
And User Enter The Last Name In The Last Name Field
And User Enter The Billing Address In The Billing Address Field
And User Enter The Credit Card Number In The Credit Card No Field
And User Select The Credit Card Type In The Credit Card Type Dropdown
And User Select The Expiry Month In The Select Month Dropdown
And User Select The Expiry Year In The Select Year Dropdown
And User Enter The CVV Number In The CVV Number Field
Then User Click The Book Now button and its Redirects To The Booking Confirmation Page

Scenario: Booking Confirmation
When User Click The My Itinerary button and its Redirects To The Booked Itinerary Page
Then User click Search Hotel button
Scenario: Booked Itinerary
When User Select The Check Box button In The Booked Itinerary Table
And User Click The Cancel Selected button
Then User Click The Log Out button and Its Redirects To The Logged Out Page
