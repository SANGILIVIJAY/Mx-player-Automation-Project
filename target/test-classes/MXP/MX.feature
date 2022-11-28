Feature: Testing Mx player others tab
Scenario Outline: To test Mx player Others and Music tab
Background:
Given I should go to the home page
When Click on the Others tab
And Click on the Music tab
And Click on the Hindi tab
And Click on the Tamil tab
And Click on the Punjabi tab
And Click on the English tab
And Click on the Telugu tab
Then I should see title as "Watch Music Videos Online on MX Player: Play Old & New Songs Videos, English Songs & Music Videos, Regional Songs & More Online for Free"