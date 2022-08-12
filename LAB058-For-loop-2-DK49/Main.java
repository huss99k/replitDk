import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    int end = inp.nextInt();
    //write your code below

    for(int i = 0;i< end*2;i++){

      if(end<0)
        System.out.print("");
      else 
        System.out.print(i + " ");
    }
    
    
  }
}