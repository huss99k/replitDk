1. Complete the StoreProduct.java class:

Include the following instance variables:

* label

* price (as an integer)

* category

* hasExpiration (as a boolean)

* stock (represents how many the store has available)


Write four constructors:

* The no-arg constructor with empty body

* A constructor that does not include a category and an expiration (category defaults to "misc", hasExpiration defaults to false)

* A secondary constructor that does not include a category, expiration, or stock (stock defaults to 0)

* A secondary constructor that does not include stock


2. Include the following instance methods:

* public void expired(boolean hasExpired)

If the product has an expiration date and hasExpired is true, then it should set the stock to 0.  Otherwise, nothing happens.

* public boolean sell(int quantity)

Check if the quantity being bought is available given the stock.  If there is enough, then make the sale by subtracting the quantity from the stock and return true (the sale was successful).  If there isn't enough, return false instead.

* public double getDiscountedPrice(double discount)

The parameter discount should be between .01 and 1 and represent a 0 to 100% discount.  Multiply the product's price by the (1 - discount) and return that number.


3. Test your code with the Main.java class:

Create several StoreProduct objects using all Constructors and print their fields to make sure it's correct.
And call the instance methods to verify the implementation is correct.