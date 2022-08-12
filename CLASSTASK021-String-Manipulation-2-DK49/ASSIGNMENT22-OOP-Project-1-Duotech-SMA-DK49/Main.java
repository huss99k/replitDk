import java.util.Scanner;
class Main extends Student { 
  public static void main(String[] args) {
    
     System.out.println("******************** DUOTECH STUDENT MANAGEMENT APPLICATION ********************");
     System.out.println("---------------------------------------------------------------------------------");
    boolean nc = false;
    int i = 0;

    Student[] students = new Student[10];
    
do{
         System.out.println("Would You Like To add New Student");
         System.out.println("Please Enter True or False");
    
     Scanner scan  = new Scanner(System.in);
      nc = scan.nextBoolean();
  if(nc == false )
     break;
    i++;
    Scanner sc = new Scanner(System.in);
  
      System.out.println("Please Enter  Firstname");
        String firstName = sc.nextLine();
   System.out.println("Please Enter Lastname");
        String lastName = sc.nextLine();
  System.out.println("Please Enter Your Batch No.");
        int batchNo = sc.nextInt();
   System.out.println("Please Enter is it OnCampus");
        boolean isOnCampus = sc.nextBoolean();
  System.out.println("Please Enter the  number of Subjects You want to Enter");
        int n = sc.nextInt();
          
     String[] ns = new String[n];
   System.out.println("Please Enter the Subjects Now");
  
     for(int j = 0; j < ns.length; j++){
       ns[j] = sc.nextLine();        
     }
       

    System.out.println("Creating new Student...");

   Student student = new Student(firstName,lastName,batchNo,isOnCampus,ns);    
          students[0] = student;
          setNumberOfStudentsCreated(i);

       
    System.out.println("Here's the Information about the new student: ");
    System.out.println("----------------------------------------");
  
    System.out.println(student.toString());

   System.out.println("What is the amount of tuition being paid Today");
   int amount = sc.nextInt();

    payTuition(amount);
      
  
  

  
  
     
       
      


    
  }while(nc == true);


     System.out.println("THANK YOU FOR USING DUOTECH STUDENT MANAGEMENT APPLICATION. GOODBYE!");
    
  }
}