Feature:add search the product and verify it 
Background:
Given open the browser And load the url of flipcart "https://www.flipkart.com/"

 Scenario Outline:Scenario: 
When search the item "iphone" in the searchbar
When  Click on  the product "<productname>"
And navigate to new window 
And  click add to cart button in flipcart
When product is added click on add to cart in flipcart 
And verify the product is added correctly "<productname>"

Examples:
|productname|
|Apple iPhone 16 (Black, 128 GB)|
|Apple iPhone 16 Pro Max (Natural Titanium, 256 GB)|
|Apple iPhone 16 (Teal, 128 GB)|



