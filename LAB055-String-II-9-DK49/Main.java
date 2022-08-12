class Main {
  public static void main(String[] args) {

System.out.println(frontAgain("edited")); // → true
System.out.println(frontAgain("edit")); // → false
System.out.println(frontAgain("ed")); // → true
System.out.println(frontAgain("jjj")); // → true	
System.out.println(frontAgain("jjjj")); // → true	
System.out.println(frontAgain("jjjk")); // → false		
System.out.println(frontAgain("x")); // → false	
System.out.println(frontAgain("")); // → false
    
  }



public static boolean frontAgain(String str) {

  boolean result = false;
  if(str.length() <= 1)
     result = false;
  else if(str.substring(0,2).equals(str.substring(str.length()-2)))
      result = true;
   else
       result = false;

  return result;
}


}