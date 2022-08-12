class Main {
  public static void main(String[] args) {
    //Test your class here

    Fan obj = new Fan();
    Fan obj1 = new Fan(35,12.9,"Maroon",true);

     obj.speed = 3;
     obj.radius = 10;
     obj.color = "yellow";
     obj.isOn = true;

   // System.out.println(obj.toString());
   // System.out.println(obj.noOfFans);
   // System.out.println(obj1.toString());
   // System.out.println(obj1.noOfFans);

   System.out.println(obj1.productId);
   System.out.println(obj.productId);


    
    

    
  }
}