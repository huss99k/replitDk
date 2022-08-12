class Main {
  public static void main(String[] args) {
    // test your method here 
   System.out.println(returnrandomchar(89));
   
  }

  public static String returnrandomchar(int a){

    int i = 0;
    String c  = "";

    while(i < a){
      char random1 = (char)(97 +(int)(Math.random()*26));
      c = c + random1;
      i++;
      
    
  }
    i++;
    return c;
}
}