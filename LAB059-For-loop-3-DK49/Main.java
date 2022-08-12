import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    //write your code below
    char result = 'j';
    for(int i =0;i<word.length();i++){

     // result = word.charAt(i);
        result = word.charAt(i);

      String result1 = Character.toString(result);
      System.out.println(result1);
    }
    
    
  }
}
