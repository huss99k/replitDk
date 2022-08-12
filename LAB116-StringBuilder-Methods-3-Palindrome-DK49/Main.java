import java.util.*;
class Main {
  public static void main(String[] args) {
    //TEST

    System.out.println(isPalindrome("Able was I ere I saw Elba")); //-> true
    System.out.println(isPalindrome(" A man, a plan, a canal – Panama")); //-> true
    System.out.println(isPalindrome("Madam, I'm Adam")); // -> true
    System.out.println(isPalindrome("Mr. Owl ate my metal worm")); //-> true
    System.out.println(isPalindrome("Do geese see God")); // -> true
    System.out.println(isPalindrome(" Was it a car or a cat I saw")); //-> true
    System.out.println(isPalindrome("Go hang a salami, I'm a lasagna hog")); //-> true
    System.out.println(isPalindrome("Show me the code"));  // -> false
  }


  public static boolean isPalindrome(String str){  
    boolean result = false;
     String temp = "";
    String[] arr = str.split("\\W*");
      
     
     
      //System.out.println("" + str01));

      for( int i = 0 ; i < arr.length; i++){
          temp += arr[i]; 
        
      }
        // System.out.println(temp);

    
    StringBuilder sb=new StringBuilder(temp); 
    sb.reverse();  
    String  rev = sb.toString();  
    if(temp.equalsIgnoreCase(rev)){  
        result = true;  
    }  
      
    return result;
  }
}

  