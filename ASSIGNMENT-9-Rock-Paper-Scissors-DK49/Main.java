import java.util.*;
class Main {
  public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter a number for game :" + "\n 1 for Rock " + "\n 2 for Paper" + "\n 3 for Scissors");
  
    int object = input.nextInt();
    int ran = (int)(1+ Math.random()*3);
    String msg = "";
     
    switch(object){

        case 1: System.out.println("You Entered :" + object + " Computer Entered :" + ran+  " Draw!");
          break;
         case 2: System.out.println("You Entered :" + object + " Computer Entered :" + ran+  " Draw!");
          break;
         case 3: System.out.println("You Entered :" + object + " Computer Entered :" + ran+  " Draw!");
          break;
    }
          if(object == 1 & ran == 2){
                    System.out.println("You chose Rock. Computer chose Paper. You Lost!");      
          }else if(object == 2 & ran == 1){
                    System.out.println("You chose Paper. Computer chose Rock. You Won!");
          }else if(object == 3 & ran == 1){
                    System.out.println("You chose Scissor. Computer chose Rock. You Lost!");
          }else if(object == 1 & ran == 3){
                    System.out.println("You chose Rock. Computer chose Scissor. You Won!");
          }else if(object == 2 & ran == 3){
                    System.out.println("You chose Paper. Computer chose Scissor. You Lost!");
          }else 
                    System.out.println("You chose Scissor. Computer chose Rock. You Won!");
          
          
            
         

    
    
     
   
  }
}