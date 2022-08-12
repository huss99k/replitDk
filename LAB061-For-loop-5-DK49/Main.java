import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    //write your code below
    String vowels = "";
    
    for(int i = 0; i < word.length();i++){
       char result = word.charAt(i);
      if(word.charAt(i) == 'a' 
         || word.charAt(i) == 'A' 
         ||word.charAt(i) == 'e' 
         ||word.charAt(i) == 'E' 
         ||word.charAt(i) == 'i' 
         ||word.charAt(i) == 'I' 
         ||word.charAt(i) == 'o' 
         ||word.charAt(i) == 'O' 
         ||word.charAt(i) == 'u' 
         ||word.charAt(i) == 'U'){

        vowels += result + "";
        

        
         }
     
          
        
      
      
    }

       System.out.println(vowels);


    
    
  }
}