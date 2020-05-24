Feature: CreateLead in leaftaps application [TET-1001]

Scenario Outline: [TC001] Positive flow for create lead
And User enters <username> in username field
And User enters <password> in password field
When User clicks on decorativesubmit button
When User clicks on crmsfa link
When User clicks on Leads button
When User clicks on createLead button
When User enters companyname as TestLeaf
And User enters Sangavi value in firstname field
And User enters Gopalakrishnan value in lastname field
And User clicks on Submit button
Then User should able to see View Lead page

Examples:
|username         |  password |
|Demosalesmanager |  crmsfa   |
|DemoCSR          |  crmsfa   |

Scenario Outline: [TC002] Negative flow for create lead
And User enters <username> in username field
And User enters <password> in password field
When User clicks on decorativesubmit button
When User clicks on crmsfa link
When User clicks on Leads button
When User clicks on createLead button
And User clicks on Submit button
But User should be in CreateLead page

Examples:
|username         |  password |
|Demosalesmanager |  crmsfa   |