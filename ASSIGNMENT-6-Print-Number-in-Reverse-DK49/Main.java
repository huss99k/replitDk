class Main {
  
  public static void main(String[] args) {
        
        printReverse(); // Don't change anything here. Simply run the code to test the output.
  }


  public static void printReverse()  {


    int ran01 = (int)(10 + Math.random()*9999);

    System.out.println(ran01);
    int reverse01 = (ran01/1);
      int temp01 = (reverse01%10);
      System.out.println(temp01);
      int reverse02 = (reverse01/10);
      int temp02 = (reverse02%10);
      System.out.println(temp02);
      int reverse03 = (reverse02/10);
      int temp03 = (reverse03%10);
      System.out.println(temp03);
      int reverse04 = (reverse03/10);
      int temp04 = (reverse04%10);
      System.out.println(temp04);
    
     


       
        // Write the method logic here

    }
}