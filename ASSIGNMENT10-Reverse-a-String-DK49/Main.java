class Main {
  public static void main(String[] args) {


    System.out.println(reverse("boy"));
  }


 // Don't change the method header, otherwise the unit tests may fail
  public static String reverse(String str){
  
  String result = "";

    if(str == null | str.equals(""))
       result = "";
    else if(str.length() == 1)
         result = str;
    else {
           StringBuffer rev = new StringBuffer(str);

           rev = rev.reverse();
     
        System.out.println("Reversed : " + rev);
        result = "" + rev;
  
  }
    return result;
}
}