
Feature: To validate signup page in facebook
Scenario: To create New Account
Given To launch the browser and maximize window
When To launch the url of fb
And To click the create new account button

# one dimentional list
And To pass firstname in firstname text box
|Jeeva|Sakthi|Jeevasakthi|

#Two dimentional list
And To pass surname in surname box
|Java      |Selenium|frameworks|
|Api       |TestNg  |cucumber  |
|Automation|Manual  |Testing   |

#One dimentional map
And To pass mob or email in email box
# key           value
|Number1|9677783073               |
|Number2|9043617617               |
|Email1 |jeevasakthi2404@gamil.com|
|Email2 |jkriderns200@gmail.com   |

#Two dimentional Map
And To create new password in new password box
|Password1|Password2|Password3|
|pass@1234|1234@pass|12@34pass|
|4321@pass|pass@4321|@pass1234|

Then To close the browser