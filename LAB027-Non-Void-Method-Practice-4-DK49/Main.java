import java.util.*;
class Main {
  public static void main(String[] args) {
    //Uncomment the lines below to test your code
   
     //System.out.println(getSphereVolume(3.2));
     System.out.println(getSphereVolume(12.9));
    // System.out.println(getSphereVolume(1.02));
  }


   public static double getSphereVolume(double radiusofsphere){
    System.out.println("You Entered : " + radiusofsphere);
    double volume = (4/3 *Math.PI* (radiusofsphere*radiusofsphere*radiusofsphere));
     System.out.println("Volume is : ");
     return volume;

     
   }
  // create your method here
}