Design a class that represents a Duotech student.

Your class should have the following data fields:
-name
-age
-stateOfResidence
-isOnline
-grades -> it should store the test results in int[] e.g {78,88,95}
-tuition

Constructors:
- no-arg constructor: call the constructor that initializes all fields and pass some default values. 
- constructor that initializes name: call the constructor that initializes all fields and pass some default values except the name 
- constructor that initializes all fields


And the following methods:

-getInfo() - returns info about name, age, stateOfResidence
 "NAME: Bob Dole, AGE: 26, STATE: VA"
-getAverageGrade() - returns the average of all grades
-payTuition(double amount) - subtracts the amount from the tuition
-getTuition() - returns the value of tuition

In the main method of Main class:
-create 3 objects of DuotechStudent using 3 different constructors.
-call all the methods on one of the object