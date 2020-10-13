# Case study - Selenium

### Create automated tests based on the story below
**Log into the system through given credentials**

In order to log into the system with my credentials,  
As a user, I can log in into the application by entering a registered email/user-name and password  
And I can log in into application  through Facebook, if I previously registered with it  
And I can reset my password if I have forgotten my password  
And I can recovery my user-name if I have forgotten my user-name

**Acceptance criteria**

Registered user:
- Should be able to login through email/user-name combined with correct password
- Should be able to reset its own password
- Should be able to recovery its user-name using a registered email

Non registered user:
- Should get a proper error result to a log in attempt with invalid email/user-name/password
- Should receive an error when trying to reset password with an invalid email given
- Should receive an error when trying to recovery its user-name with an invalid email address

###Notes
1. You are free to use this Jbehave project as reference to build your automation or use other automation tool of your preference
2. Create automated tests for one or more identified test cases. You do not need to cover all scenarios
3. Select a web site of your preference that covers this feature (ex. Netshoes)

## Push your changes to your own branch
Create branch from master:  
*git checkout -b selenium-assessement/\<firstname.lastname\>*

Push changes after commit:  
*git push origin selenium-assessement/\<firstname.lastname\>*

**Please request access to push your changes and you will be accepted as a contributor**

