 class Main {  


  public static void main(String[] args) {


    System.out.println("Here is the Pattern");

    line1();
    System.out.println();
    line1();
    line2();
    line1();
    System.out.println();
    line1();
    line3();
    line4();
    line3();
    line3();
    
    
    
    // call your methods here
  }
   
   public static void line1(){

     System.out.println("    *****\n" +
                      "  *********\n" +
                     "*************" );


   }

   public static void line2(){

     System.out.println("* | | | | | *\n"  +
                        "*************");



   }
  // Create your methods here
      public static void line3(){

        System.out.println("    *****");



      }


      public static void line4(){


        System.out.println("* | | | | | *\n" +
                          "* | | | | | *");


      }

}