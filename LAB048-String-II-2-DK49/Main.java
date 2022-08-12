class Main {
  public static void main(String[] args) {
    
    //tests
    System.out.println(firstHalf("WooHoo")); // → "Woo"
    System.out.println(firstHalf("HelloThere")); // → "Hello"
    System.out.println(firstHalf("abcdef"));  // → "abc"
    System.out.println( firstHalf("ab") ); //→ "a"	
    System.out.println(firstHalf("") ); //→ ""
  }

  
public static String firstHalf(String str) {


   String result = "";

   result = str.substring(0,str.length()/2);
  return result;
  
}

}