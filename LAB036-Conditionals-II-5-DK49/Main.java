class Main {

  public static void main(String[] args) {
    //Test here
    
    //System.out.println(makes10(9, 10)); //true
     System.out.println(makes10(10, 6)); //true
     System.out.println(makes10(9, 9)); //false
     System.out.println(makes10(9, 1)); //true
     System.out.println(makes10(5, 5)); //true
     System.out.println(makes10(12, -2)); //true

    
  }


  public static boolean makes10(int a, int b) {
      boolean result = false;
    if(a == 10 || b == 10)
       result = true;
    else if(a+b == 10)
       result = true;
    else
        result = false;
        
     return result;
  } 

}