Create a method called getRandomCreditCardNo() that generates a random credit card number for either of the 4 credit card companies: American Express, Visa, Mastercard and Discover and returns it as a String.

Your method should have one int parameter that represents the credit card company:
  
   1 -> American Express (i.e, if you pass 1 as an argument, it needs to return random American Express card number. ) 
   2 -> Visa
   3 -> Mastercard
   4 -> Discover

If the argument is any other number, your method should simply return 0.

Credit card number generation rules:

-American Express must start with 3 and must be 15 digits long. e.g. 345672363622649

-Visa must start with 4 and must be 16 digits long. e.g. 4456723636226497

-Mastercard must start with 5 and must be 16 digits long. e.g. 5456723636226494

-Discover must start with 6 and must be 16 digits long. e.g. 6456723636226491


NOTE: Since this method is a value-returning method, using multiple return statements in each of the one way if statements will cause a compiler error. To work around this, declare a String variable in your method body and assign the generated credit card number in each of your if statements and return that variable with a single return statement at the end. 

Examples:

   getRandomCreditCardNo(1)  ->  345672363622649 
   getRandomCreditCardNo(2)  ->  4456723636226497
   getRandomCreditCardNo(3)  ->  5456723636226494
   getRandomCreditCardNo(4)  ->  6456723636226491
   getRandomCreditCardNo(0)  ->  0
   getRandomCreditCardNo(1000)  ->  0
   getRandomCreditCardNo(-23)  ->  0
     


 



