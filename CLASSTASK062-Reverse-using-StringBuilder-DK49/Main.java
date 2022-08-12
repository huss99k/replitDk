class Main {
  public static void main(String[] args) {
  
     // Create a method that takes a  String and returns the reversed version of it as a String. Use Java's built-in method.

    System.out.println(reverse("Trump"));

  }


   public static String reverse(String str1){

        StringBuilder str = new StringBuilder(str1);
        System.out.println("String = " + str.toString());
        StringBuilder reverseStr = str.reverse();
  
  
       return   "Reverse String = " + reverseStr.toString();
   }



}