class Main {
  public static void main(String[] args) {
    //tests
    System.out.println(withouEnd2("Hello") ); //→ "ell"
    System.out.println(withouEnd2("abc")); // → "b"
    System.out.println(withouEnd2("ab")); // → ""
    System.out.println(withouEnd2("a") ); //→ ""		
    System.out.println(withouEnd2("")); // → ""
  }


  public static  String withouEnd2(String str) {

    String result = "";
    if(str.length() < 2)
      System.out.println("");
    else
    result = str.substring(1,str.length()-1);
    

  return result; 
      
}
}