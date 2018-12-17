Feature: Login into Application

Scenario Outline: Sending an email u Outlook
Given Initialize the browser with chrome
And Navigate to "https://outlook.live.com" Site
And Enter the Sign In details to successfuly sign in
And enter receivers email address,subject,Compose email and hit send.
Then Email is successfully sent to the receiver.
And close browsers.

Examples:
|username			|password	|
|test99@gmail.com	|123456		|
|test123@gmail.com	|12345      |





