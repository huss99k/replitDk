Project: Duotech SMA (Student Management Application)

Design a small java application for managing students at Duotech!

Steps:

A. Design a class Student.

   It contains the following:
  
   Data fields: (You will need to determine which ones are static and which ones are instance)
   - firstName - represents Student's first name
   - lastName - represents Student's last name
   - batchNo  - represents Student's batch number. 
   - isOnCampus - represents if a Student is an on-campus student.
   - studentID - represents Student's id number. e.g JE5031
   - subjects - represents the subjects that the students are going to learn: Java, HTML, Selenium, Cucumber, RestAssured, SQL. 
  Must be initialized when declared.
   - SCHOOL_NAME - represents a constant, school's name which must be initialized to "Duotech".
   - numberOfStudentsCreated - represents a variable to track the number of Student objects created. Must be initialized to 0 and incremented in each constructor.
   - tuitionBalance - represents Student's tuition balance
   

   Constructors: 
   
   - no-arg constructor that initializes fields to default values.
   - constructor that initializes firstName , lastName, batchNo, isOnCampus. Besides that it needs to do the following:
      - initializes studentId using generateStudentID() method.
      - initializes tuitionBalance to 5000 if student isOnCampus, otherwise to 4000.
  
   Methods: (You will need to determine which ones are static and which ones are instance)
     - generateStudentID() - returns a unique student id using the following combination:
       first letter of the first name +  last letter of the last name + batchNo + random 3 digit number
       Example: John Doe, Batch 5 -> JE5031 (3 digit random number should allow combinations like 031)
     - getStudentInfo() - returns the following information about the student in this format:
          STUDENT: John Doe
          SCHOOL: Duotech
          BATCH: 5
          STUDENT ID: JE5031
          ON-CAMPUS: yes  
          SUBJECTS: [Java, HTML, Selenium, Cucumber, RestAssured, SQL]
          TUITION BALANCE: 1500
     - getSubjects() - returns all subjects in this format: [Java, HTML, Selenium, Cucumber, RestAssured, SQL]
     - payTuition() - accepts an amount and deducts the amount from the tuitionBalance and displays the message  about the new balance, e.g tuitionBalance is 4000 and you pay 500 and balance becomes 3500,  -> "The new balance is $3500".
     If the balance becomes exactly 0, display the message -> "The tuition is paid off."
     If the amount is greater than the tution balance and balance goes negative, e.g tuitionBalance is 400 and you pay 800 and balance becomes -400, display the message  -> 
     "The tuition is paid off. A credit of 400 dollars is applied to this account." 

B. In the Main class:
   
   Create an application in the main method that does the following:
  
  -Asks the user to enter the information about a new student to be added 
  -Once the information is received, creates a new student and displays information about the new student
  -Asks the user to enter the tuition payment amount
  -Displays the new balance after the payment
  -Displays the amount of students created
  -Asks the user if he/she would like to add another student. If yes, the entire process repeats again, until the answer is no (use do-while). When the answer is no, the application ends with goodbye message.

   Please refer to the attached pdf for examples of console output.


