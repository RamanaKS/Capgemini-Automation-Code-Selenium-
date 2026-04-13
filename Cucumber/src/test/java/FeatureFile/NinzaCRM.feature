Feature:Login
Scenario:Navigate to ninzacrm page add a  new campaign and verify it  
Given open the browser
And Navigate to Application
When enter username and password
And click on login button
When click on campaign btn
And click on createCampaign button
When enter campaign name and targetsize 
And click on create campaign button
Then verify it add or not
And click on logout