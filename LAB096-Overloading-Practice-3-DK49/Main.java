class Main {
  public static void main(String[] args) {

    
    System.out.print(getArea(6.7));
    System.out.print(getArea(4.5,7.8));
    System.out.print(getArea(8.7,19));
    
      
  }

   public static double getArea(double r){
     
     double result;
     double sqr = r*r;
     if(r>0)
       result = Math.PI*sqr;
     else
        result = 0;

     return result;

    
   }

     public static double getArea(double width,double height){
          System.out.println();
          double result1 = 0;

       if(width>0 & height>0)
         result1 = width*height;
       else
          System.out.print("Entered Values are Invalid");
           
     
     
    

     return result1;
     
   }

      public static double getArea(double radius,int h){
        System.out.println();
        double result2 = 0;
        double sqr = radius*radius;
        double p = 2*Math.PI;

         if(radius>0 & h>0)
           result2 = p*sqr*h;
         else
          System.out.print("Entered Values are Invalid");
          

         return result2;
          }
  

}