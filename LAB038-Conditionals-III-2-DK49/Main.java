class Main {
  public static void main(String[] args) {
    //Tests

     System.out.println(in3050(30, 31)); // true
     System.out.println(in3050(30, 41)); // false
     System.out.println(in3050(40, 50)); // true
     System.out.println(in3050(40, 51)); // false
     System.out.println(in3050(39, 50)); // false
     System.out.println(in3050(50, 39)); // false
     System.out.println(in3050(40, 39)); // true
     System.out.println(in3050(49, 48)); // true
     System.out.println(in3050(35, 45)); // false

    

  }

  public static boolean in3050(int a, int b) {
   
   boolean result = false;

    if((a>=30 & a<=40) & (b>=30 & b<=40))
      result = true;
    else if ((a>=40 & a<=50) & (b>=40 & b<=50))
       result = true;
    else
       result = false;

    return result;
  }

}