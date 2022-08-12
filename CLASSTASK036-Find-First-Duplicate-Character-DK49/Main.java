class Main {
  public static void main(String[] args) {

    duplicate("goodboy");
    duplicate("aghj");
  }


  public static void duplicate(String str){

    System.out.print("Duplicate Characters in above string are: ");
   LOOPA: for (int i = 0; i < str.length()-1; i++) {
  LOOPB: for (int j = i + 1; j < str.length(); j++) {
      if (str.charAt(i) == str.charAt(j)) {
         System.out.println(str.charAt(j) + " found" );
         break LOOPA;
      }else          
                     System.out.println("not found");

        
   }
}

  
    }
}

 