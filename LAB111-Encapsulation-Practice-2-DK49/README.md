Create a well-encapsulated class ShoppingCart.

It should contain the following:

Data fields:

totalNumberOfItems - The number of items in the shopping cart.
totalAmountOwed	 - The total amount owed.

All shopping cart objects will have total 0 items and 0.0 amount owed by default.

Methods:

Getters and setters for all data fields.

getAveragePricePerItem()  - returns the result of totalAmountOwed / totalNumberOfItems.
addItems(int numberOfItems, double pricePerItem)  - updates totalNumberOfItems and increases totalAmountOwed by (pricePerItem * numberOfItems)
empty() - resets totalNumberOfItems to 0 and totalAmountOwed to 0.0.


Create one object of the class in the main method and call getters, setters and other methods to test your class.


