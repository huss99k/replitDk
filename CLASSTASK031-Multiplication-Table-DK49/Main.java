class Main {
  public static void main(String[] args) {


       System.out.println("\t     Multiplication Table");
    for(int i = 1; i <=20; i++){
      System.out.print("\t" + i );
    }
    System.out.println();
    
    System.out.println("\t-----------------------------------");

    for (int i = 1; i <= 20; i++) {
        System.out.print(i+"|");
        for (int j = 1; j <= 20; j++) {

            System.out.print ("\t"+i*j);
        }
        System.out.println();
    }








    
  }
}