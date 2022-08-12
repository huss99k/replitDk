class Main {
  public static void main(String[] args) {
    // call your methods here


    patternA();
    space1();
    patternA();
    patternB();
    patternA();
    space1();
    patternA();
    patternC();
  }

 public static void patternA(){

   System.out.println("    *****\n" +
                      "  *********\n" +
                     "*************");
 }


  public static void patternB(){

    System.out.println("* | | | | | *\n" +
                      "*************");
  }
   //create your methods here

    public static void patternC(){

      System.out.println("    *****\n" +
                        "* | | | | | *\n" +
                        "* | | | | | *\n" +
                        "    *****\n" +
                        "    *****");
    }

   public static void space1(){

     System.out.println("       ");
   }

}