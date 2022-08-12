class Main {
  public static void main(String[] args) {
   
   // write method calls here
    pattern01();
    space01();
    methodpattern1();
    methodpattern1();
    pattern01();

  }

  public static void pattern01(){

    System.out.println("Go, team, go!\n" +
                       "You can do it.");
    
  }

    public static void pattern02(){

      System.out.println("You're the best,\n" +
                         "In the West.");
    }
   // create your methods here

   public static void space01(){

     System.out.println("   ");
   }

    public static void methodpattern1(){

      pattern01();
      pattern02();
      pattern01();
      space01();
    }


}