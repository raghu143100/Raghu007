Feature: Create Lead
@Smoke @Sanity
Scenario Outline: Create Lead (+ve)

Given Enter Username <uname>
And Enter Password <password>
And Click on login
And Click CRMSFA link
And Click Leads Tab
And Click Create Lead
And Enter Company Name <cname>
And Enter First Name <fname>
And Enter Last Name <lname>
And Select SourceID <source>
And Select CampaignId <cmpID>
When Click on Create lead button

Examples:
|uname|password|cname|fname|lname|source|cmpID|
|DemoSalesManager|crmsfa|Leaftaps|Raghu|Sandeep|Employee|7|

@Smoke @Regression
Scenario Outline: Create Lead (-ve)

Given Enter Username <uname>
And Enter Password <password>
When Click on login


Examples:
|uname|password|
|DemoSalesManager|crm|