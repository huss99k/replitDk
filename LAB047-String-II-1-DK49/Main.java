class Main {
  public static void main(String[] args) {
    
    // test here
  System.out.println(makeOutWord("<<>>", "Yay"));   //→ "<<Yay>>"
  System.out.println(makeOutWord("<<>>", "WooHoo"));  //→ "<<WooHoo>>"
  System.out.println(makeOutWord("[[]]", "word")) ; // → "[[word]]"
  System.out.println(makeOutWord("HHoo", "Hello")); // → "HHHellooo"	
  System.out.println(makeOutWord("abyz", "YAY")); // → "abYAYyz"

  }


  public static String makeOutWord(String out, String word) {

     String result = "";
       String result2 = "";
      result = (out.substring(0,2)).concat(word);
       result2 = result.concat(out.substring(2));
    
      return result2;
  }
}