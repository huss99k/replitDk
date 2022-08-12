class Main {
  public static void main(String[] args) {
    // Tests
     
      System.out.println(in1020(12, 99)); //true
      System.out.println(in1020(21, 12)); //true
      System.out.println(in1020(8, 99)); //false
      System.out.println(in1020(21, 21)); //false
      System.out.println(in1020(20, 20)); //true
      System.out.println(in1020(99, 10)); //true
     
  }

  public static boolean in1020(int a, int b) {

    boolean result = false;

    if(a>=10 & a<=20 || b>=10 & b<=20)
       result = true;
    else
        result = false;

    return result;
  }

}