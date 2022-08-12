 import java.util.*;
 class Main {
  public static void main(String[] args){
       
  //Create your method here
     
    System.out.println(convertor("89770.9"));   
    System.out.println(convertorZ("73473.093"));   

            
}
    public static double convertor(String price){
       double result = 0;
       result += Double.parseDouble(price);
        return result;   
  }

      public static int convertorZ(String price){
       int result = 0;
        try{
            result += Integer.parseInt(price);
          }catch(NumberFormatException e){
                 System.out.println("Wrong Number Format");
          }         result = 0;
        return result;
        
      }



   
 }