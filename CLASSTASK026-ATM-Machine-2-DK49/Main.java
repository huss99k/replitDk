import java.util.*;
class Main {
  public static void main(String[] args) {


             Scanner input = new Scanner(System.in);
             String  realpass = "1141";
             int count = 0;
            System.out.println("Welcome to DuoBank.");

    do{   

                  System.out.println("Please Enter your pin: ");      
                    
       count++;
    if(count>=3)
      System.out.println("You Entered Wrong Pin 3 Times.Your Account is locked.Please contact Customer Service ");
    
      
    }while(!realpass.equals(input.next()));

    System.out.println("Welcome to DuoBank.");
      
      
      
      
      
    

    
  }


}