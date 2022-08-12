Create a class for a Product.
 
 Instance Variables:
 -name
 -price
 -quantity
 -fabricType

 -getters and setters for all fields
 -constructor to initialize all fields
 -toString that prints out the info


-Make your class implement Comparable interface and override its compareTo method by comparing its NAMES


-In a Main class, create a List of Products and add 4 products to the list with various values
-Call Collections.sort() method on a list to verify if the list is being sorted by the name.
- Create a custom comparator using Comparator interface and override the implementation of its compare() method by comparing objects by their prices.
-Call Collections.sort() by passing the custom comparator and verify that the list is being sorted by price.

 