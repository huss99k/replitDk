class Main {
  public static void main(String[] args) {
    // Use nested loops to print out the pattern given in the file
 int rows = 6;

    for (int i = rows; i >= 1; --i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j + " ");      
      }
     System.out.println(" ");
    }
     

    
    }
}