import java.util.*;
class Main {
  public static void main(String[] args) {
   
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number between 1-999:");
    int number = scan.nextInt();

    
    
    //DON'T CHANGE THE CODE ABOVE
    //Write your code below. 
    //Use the "number" variable that is declared above to calculate the sum of its digits.
    
    int input3 = (number % 10);
    int number1 = (number / 10);
    System.out.println(input3);

    int input2 = (number1 % 10);
    int number2 = (number1 / 10);
    System.out.println(input2);


    int input1 = (number2 % 10);
    int number3 = (number2 / 10);
    System.out.println(input1);

    System.out.println("You entered :" + number);
    System.out.println("The sum of Digits :" + number);
    System.out.println(input3 + input2 + input1);







    

  


    
    

    


    
  }
}