class Main {
  public static void main(String[] args) {
   // Run unit tests to test your method

  //  System.out.println(isPalindrome("civic"));
   System.out.println(isPalindrome("civic"));
}

  //Don't change the method header
public static boolean isPalindrome(String str){  
   boolean result  = false;
       
 OuterLoop:for(int i = 1;i >= 0;i++){
     if(str.substring(0,i).equalsIgnoreCase(str.substring(str.length()-1,str.length()-i+i))){
            result = true;
            break OuterLoop;
     }else{
         System.out.println("Ur Word Doesn't match requirments for Palindrome.\n Enter Again");
             break  OuterLoop;
  }
   }
    
  
       
   return result;
}

}

