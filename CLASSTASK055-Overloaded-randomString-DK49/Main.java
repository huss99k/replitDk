class Main {
  public static void main(String[] args) {

    //System.out.println(randomString());
    // System.out.println(randomString(7));
   // System.out.println(randomString(9,false));
      
  }

  public static String randomString(){
    
   String result = "";
    for(int i = 0;i<=5;i++){
    char a = (char)(97 + (int)(Math.random() * (91 - 65)));
    result += a;

      } 
    return result;
    
  }
   public static String randomString(int length){
     System.out.println();
     String result = "";
     for(int i =0; i<length;i++){
     char b = (char) (65 + (int)(Math.random() * (91 - 65)));
      result += b ;
       } 
     return result;
   }
  public static String randomString(int length,boolean value){
    System.out.println();
     String result = "";
     for(int i = 0; i<length;i++ ){
       if(value == true & length>0){
       char c = (char) (65 + (int)(Math.random() * (91 - 65)));
       result += c ;
     }else if(value == false){
         char d = (char) (97 + (int)(Math.random() * (91 - 65)));
       result += d ;
     }
       
  }
     return result;
}
}