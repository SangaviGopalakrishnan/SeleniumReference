Feature: CreateLeads in leaftaps application [TET-1002]

Scenario Outline: [TC01] Positive flow for create leads
Given User enters <username> in username field
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