class Main {
  public static void main(String[] args) {
    //Test here
     //  System.out.println(lastDigit(7, 17)); //true
       //System.out.println(lastDigit(114, 113)); //false
       System.out.println(lastDigit(114, 4)); //true
      // System.out.println(lastDigit(10, 0)); //true
      // System.out.println(lastDigit(0, 11)); //false
     
  }

  public static boolean lastDigit(int a, int b) {
     if(a%10==b%10)
       return true;
         else 
            return false;
    
  }
}