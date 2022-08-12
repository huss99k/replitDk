import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	Scanner inp = new Scanner(System.in);
  	System.out.print("In:");
  	String word = inp.nextLine();
  	//DO NOT CHANGE ABOVE CODE!  Write your code below
  	
  	if(word.endsWith("ife"))
      System.out.println("-ives");   
     else if(word.endsWith("ey"))
      System.out.println("-eys");    
    else if(word.endsWith("y"))
      System.out.println("-ies");
      else
       System.out.println("-s");
    //if(word.charAt(word.length()-1)==('e'))
      //System.out.println("-ives");   
      //else
       //System.out.println("-s");
    
  }

     
  
}
