public class Student{
      
  //instance variables here
  String name = "";
  int grade = 0;
  double gpa = 0.0;
  int daysAbsent = 0;
  
	
	
	
	//instance methods here

   public void changeGPA(double newGPA){

      gpa = newGPA;
   }

   public void changeName(String newName){
     name = newName;
 }

   public void graduate(){
     grade += 1;
   }

   public void checkAbsence(boolean isAbsent){
     if(isAbsent == true)
       daysAbsent += 1;
   }

   public void printInfo(){
       System.out.println();
     
        System.out.println("Name: " + name );
        System.out.println("GRADE: " + grade);
        System.out.println("GPA: " + gpa );
        System.out.println("DAYS: " + daysAbsent);
   }
	
}