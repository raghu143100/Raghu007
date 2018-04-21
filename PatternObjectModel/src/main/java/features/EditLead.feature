Feature: Edit Lead
@Update
Scenario Outline: Edit Lead

Given Enter Username <uname>
And Enter Password <password>
And Click on login
And Click CRMSFA link
And Click Leads Tab
And Click Find Leads
And Enter Lead FirstName <fname>
And Click FindLeads Button
And Select First Result
And Click Edit Button
And Change the Company Name <newcompany>
When Click Update Button
#Then Get Updated Company Name

Examples:
|uname|password|fname|newcompany|
|DemoSalesManager|crmsfa|Ragh|Zingala|
