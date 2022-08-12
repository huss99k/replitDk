// Create your class here

 public class Rectangle{

  double width = 1;
   double height = 1;
  

   public Rectangle(){
     
   }

   public double getArea(){
   double result = 0;
     result = width*height;
     return result; 
   }

   public double getPerimeter(){

     double result = 0;

     result = 2*(width+height);

     return result;
   }
   
 }