class Main {
  public static void main(String[] args) {

   System.out.println(conCat("dog", "cat"));
    System.out.println(conCat("rn", "nat"));
    System.out.println(conCat("Java", "apple"));
  } 

  public static String conCat(String a,String b){

     String result ="";

    //if(a.substring(0,a.length()-1).equalsIgnoreCase(b.substring(0)))
      if(a.charAt(a.length()-1) == b.charAt(0))
      result = a.substring(0,a.length()-1) + b;
    else
        result = a+b;
    

    return result;
    
  }

}