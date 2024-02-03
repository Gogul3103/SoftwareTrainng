Feature: To check Login functionality of inmakes Learning hub

Background:  
Given     To launch browser and windows maximize

Scenario: To Login in inmakes learning hub with valid email and password

When      To launch valid url
And       To click login button
And       To pass valid email of email field
And       To pass Valid password of password field
And       To click login button to enter page
And       To check Whethere the page is navigate or not


         
Scenario Outline:  User has login in to the inmakes learning hub

When   To launch the url of Inmakes learning hub 
And    click login button to enter login field
And    user has pass the valid data"<email data>" in email field
And    user has pass vali data"<password data>" in password field
And    user has click login button 

Examples:
|email data|password data|
|gogulakannans2019@gmail.com|12345|
|kannans2019@gmail.com|67890|
|kannamad2019@gmail.com|78900|