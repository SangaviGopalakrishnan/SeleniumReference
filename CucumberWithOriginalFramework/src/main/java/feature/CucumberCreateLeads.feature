Feature: CreateLeads in leaftaps application [TET-2001]

Scenario Outline: [TC01] Positive flow for create leads
Given User1 enters <username> in username field
And User1 enters <password> in password field
When User1 clicks on decorativesubmit button
When User1 clicks on crmsfa link
When User1 clicks on Leads button
When User1 clicks on createLead button
When User1 enters companyname as TestLeaf
And User1 enters Sangavi value in firstname field
And User1 enters Gopalakrishnan value in lastname field
And User1 clicks on Submit button
Then User1 should able to see View Lead page

Examples:
|username         |  password |
|Demosalesmanager |  crmsfa   |
|DemoCSR          |  crmsfa   |