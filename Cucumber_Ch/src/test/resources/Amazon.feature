Feature: To Validate signIn in page
Background: To launch the browser and maximize the browser

Scenario: To Validate valid username and password
When To launch the url of amazon
And To click the signIn button
And To pass the valid username in username field
And To click the continue button 
Then To Close the browser

Scenario: To Validate search Box
When To launch the url of amazon
And To pass the product name in search box
|iphone|samsung|Mi|
And To click the search button
Then To close the browser

Scenario Outline: To validate positive and negative conditon of sign page
When To launch the url of amazon
And To click the signIn button
And To pass the data "<usernameDatas>" in username field
And To click the continue button
Then To close the browser

Examples:
|usernameDatas            |
|jeevasakthi2404@gmail.com|
|jeeva2404@gmail.com      |
|967778073                |
|9042617617               |