Feature: Merge Lead
@Smoke @Sanity
Scenario Outline: Merge Lead (+ve)

Given Enter Username <uname>
And Enter Password <password>
And Click on login
And Click CRMSFA link
And Click Leads Tab
And Click Merge Leads
And Click From Lead Icon
And Enter Lead ID in New Window <id1>
And Click FindLeads Button
And Select First Result New Window
And Click To Lead Icon
And Enter Lead ID in New Window <id2>
And Click FindLeads Button
And Select First Result New Window
And Click Merge Button
And Click Find Leads on MergeLeads
And Enter Lead ID <id1>
When Click FindLeads Button

Examples:
|uname|password|id1|id2|
|DemoSalesManager|crmsfa|10058|10059|