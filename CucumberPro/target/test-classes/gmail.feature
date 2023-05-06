 Feature: To Validate Gmail Username and Password

Scenario: To Validate login gmail with valid username and password
Given To Launch the chrome browser and maximize window
When To launch the url of gmail application
And To pass valid mobile or email in username field
And To click next button
And To pass the password in password field
And To click the next button
Then To close the Browser

 
Scenario Outline: To validate Gmail with positive and negative combination
Given User Launch the browser and maximize window
When To launch the url of gamil
And User pass the data "<username>" in username field
And User click the next button
And user pass the data "<password>" in password field
And user click the next button
Then user close the close button

    Examples: 
      |username                 |password    |
      |jeevasakthi2404          |1234567890  |
      |jeevasakthi2404@gmail.com|password@123|
      |jeeva2404@gamil.com      |jeeva2404   |
      |softwaretesting@gmail.com|seleniumJava|