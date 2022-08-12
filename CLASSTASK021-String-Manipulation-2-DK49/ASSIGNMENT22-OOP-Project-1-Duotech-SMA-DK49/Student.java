import java.util.*;
public class Student {

    private String firstName;
    private String lastName;
    private int batchNo;
    private boolean isOnCampus;
    private String studentID;
    private String[] subjects;
    private final String SCHOOL_NAME = "Duotech";
    private static int tuitionBalance = 0;

    private static int numberOfStudentsCreated = 0;

    public Student() {
    }


    public String generateStudentID() {
        String result = "";
        result += firstName.charAt(0) + lastName.charAt(lastName.length() - 1) + batchNo;
        int ran = (int) (Math.random() * 999);
        result += ran;
        return result;
    }


    public Student(String firstName, String lastName, int batchNo, boolean isOnCampus,  String[] subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.batchNo = batchNo;
        this.isOnCampus = isOnCampus;
        this.studentID = generateStudentID();
        this.subjects = subjects;
        

        if (isOnCampus == true) {
            tuitionBalance = 5000;
        } else
            tuitionBalance = 4000;

        numberOfStudentsCreated += 1;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
    }

    public boolean isOnCampus() {
        return isOnCampus;
    }

    public void setOnCampus(boolean onCampus) {
        isOnCampus = onCampus;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String getSCHOOL_NAME() {
        return SCHOOL_NAME;
    }

  

    public int getTuitionBalance() {
        return tuitionBalance;
    }

    public void setTuitionBalance(int tuitionBalance) {
        this.tuitionBalance = tuitionBalance;
    }

    public static int getNumberOfStudentsCreated() {
        return numberOfStudentsCreated;
    }

    public static void setNumberOfStudentsCreated(int numberOfStudentsCreated) {
        Student.numberOfStudentsCreated = numberOfStudentsCreated;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", BatchNo=" + batchNo +
                ", IsOnCampus=" + isOnCampus +
                ", StudentID='" + studentID + '\'' +
                ", Subjects=" + Arrays.toString(subjects) +
                ", SCHOOL_NAME='" + SCHOOL_NAME + '\'' +
                ", TuitionBalance=" + tuitionBalance +
                '}';
    }


    public static void payTuition(int Amount) {
        int result = 0;

         if(Amount <= 0){
             System.out.println("Your Payment is Not Valid as Your amount was: " + Amount +" Your tuition balance is :" + tuitionBalance);
         }
        if (Amount > 0 & Amount < tuitionBalance){
            result = tuitionBalance - Amount;
            tuitionBalance = result;
            System.out.println("Your New Balance is : " + tuitionBalance);
        }
        if(Amount > tuitionBalance) {
            tuitionBalance = 0;
             result = tuitionBalance - Amount;
            System.out.println("You Overpayed the Tuition Hence Your Tuition is payed and A Credit of " + result+0 + " Has been applied to your Account");
            System.out.println("Your tuition Balance is " + tuitionBalance);
        }
        if(Amount == tuitionBalance){
            tuitionBalance = 0;
            System.out.println("You payed your Tuition in Full Thank You");
            System.out.println("Your tuition Balance is " + tuitionBalance);
        }




    }
}

 
  








  
