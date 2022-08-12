class Main {
  public static void main(String[] args) {
  //  test your method here
 // right2("john"); //→ "loHel"
 right2("java"); //→ "vaja"
// right2("Hi"); //→ "Hi"

  }


  public static String right2(String str){

      String st02 = str;
       String st01 = str.substring(str.length()-2);

     String st03 = st01+st02;
      System.out.println(st03);

      return st03;
  }
  //Create your method here
}