Create a class Student with the following:

 

  Variables (private):
  -firstName
  -lastName
  -id (the type should be String)

   Constructor:
  - initializes firstName and lastName

  Methods:
  -getters and setters
  -public String generateId() - generic implementation (you can return "")
  -toString() override it to return firstName and lastName

  
  
  Create a class OnlineStudent as a subclass of Student with the following:

  Variables (private):
  String state

   Constructor:
  - initializes firstName and lastName and state
  - also in the body of the constructor initialize the id by calling the generateId() method


  Methods:
  -public String generateId() - override super class's method -> student's first and last name's first 3 letters + state
   Example: "Joe Biden" -> joebidde
  -toString() override Student class's toString to add id and state

  
  
  
  
  Create a class OnCampusStudent as a subclass of Student with the following:

  Variables (private):
  int badgeNo

   Constructor:
  - initializes firstName and lastName and badgeNo
  - also in the body of the constructor initialize the id by calling the generateId() method


  Methods:
  -public String generateId() - override super class's method -> student's first and last name's first 3 letters + badgeNo
   Example: "Joe Biden" badgeNo - 122  -> joebid122
  -toString() override Student class's toString to add badgeNo and id


  In the Main class:

   Create an array of Students with size 4.
   Add 4 different students(both online and oncampus)
   Use a loop to go through your array and call each object's toString() method