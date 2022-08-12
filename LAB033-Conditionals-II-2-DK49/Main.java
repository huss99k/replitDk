class Main {
  public static void main(String[] args) {
    
   //Uncomment below to test your method

    // System.out.println(monkeyTrouble(true, true)); // true
    // System.out.println(monkeyTrouble(false, false)); // true
      System.out.println(monkeyTrouble(true, false)); // false
     //System.out.println(monkeyTrouble(false, true)); // false
    
  }


  
   public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
     
   if(aSmile==true && bSmile==true){
     System.out.println("We are in trouble");
     return true;
     }else if(aSmile==false && bSmile==false){
       System.out.println("We are in trouble");
       return true;
     }else 
         return false;
   
  }


}