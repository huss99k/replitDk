import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    //write your code below

    String result = "";

    for(int i = 0;i<word.length();i++){

      char resul = word.charAt(i++);
     // result = Character.toString(word.charAt(i++));
                System.out.print(resul);


      
    }

    
  }
}