class Main {
  public static void main(String[] args) {

    // tests
    System.out.println(left2("Hello")); // → "lloHe"
    System.out.println(left2("java")); // → "vaja"
    System.out.println(left2("Hi"));// → "Hi"
    System.out.println(left2("code")); //  → "deco"		
    System.out.println(left2("cat")); // → "tca"	
    System.out.println(left2("12345")); // → "34512"
  }


  public static String left2(String str) {

    String result = "";
    String result2 = "";

    if(str == null | str == "")
      System.out.println("Please Enter Something as a String :");
    else if(str.length()<=2)
          System.out.println(str);
          else{
            
      result = str.substring(0,2);
    //result2 = (str.substring(str.length()/2)).concat(result);
     result2 = str.substring(2).concat(result);
 
 }
     return result2;
    }
}