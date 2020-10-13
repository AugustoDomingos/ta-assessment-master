Narrative:
As a user
I want to log in on Startup Jedi
So I can add posts to my bookmarks

Scenario: User logs in with email using valid credentials
Given I am on startup jedi main page
When I click on log in button
And I click on log in with email button
And I enter credentials 'userEmail' and 'userPassword'
Then I should log in successfully with 'userId'

Examples:
|userEmail                     |userPassword      |userId            |
|gutoh.domingos@gmail.com      |test@123          |Guto Domingos     |
|test.medium.login@gmail.com   |test@12345        |Test Login        |

Scenario: User logs in with valid email and invalid password
Given I am on startup jedi main page
When I click on log in button
And I click on log in with email button
And I enter credentials 'userEmail' and 'userPassword'
Then I should not log in successfully with 'userId'
Examples:
|userEmail                     |userPassword      |userId            |
|gutoh.domingos@gmail.com      |test@123          |Guto Domingos     |


