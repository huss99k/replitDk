import java.util.*;
class Main {
  public static void main(String[] args) {

   
      
     System.out.println("Welcome to guessing Game");
     System.out.println("This program will let u Guess a number between 0-100");

     int rn = (int)(0 + (Math.random()*101));
    //  System.out.println(rn);   

       //Scanner scan = new Scanner(System.in);
       //int inp = scan.nextInt();

    
       OuterLoop :for(int i = 0; i >= 0 ; i++){
         Scanner scan = new Scanner(System.in);
         int inp = scan.nextInt();

         
      InnerLoop:   for(int j = 0; j >= 0;j++){
            if(inp == rn){
              System.out.println("Congratulations You found the Number its:" + inp);
                    break OuterLoop;
              }else if(inp > rn){
              System.out.println("Your Guess is Too high Try again");
                  break InnerLoop;
        }else{
          System.out.println("Your Guess is Too low Try again");
                 break InnerLoop;
              }

         }
         }

  }
}