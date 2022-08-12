class Main {
  public static void main(String[] args) {
   //Tests

     lastTwo("coding");// → "codign"
     lastTwo("cat");// → "cta"
     lastTwo("ab"); //→ "ba"
     lastTwo("a"); //→ "a"
     lastTwo(""); //→ ""

    
    
  }

  public static String lastTwo(String str){
    String result = "";
     if(str.length() < 2)
        System.out.println(str);
    else{
     char result1 = str.charAt(str.length()-1);
     char result2 = str.charAt(str.length()-2);
     result = "" + result1 + result2;
      str = str.substring(0,str.length()-2).concat(result);
    System.out.println(str);
      }
      return result;
  }
}