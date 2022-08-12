// Create and implement the class here
 public class Fan{

   final int SLOW = 1;
   final int MEDIUM = 2;
   final int FAST = 3;

   int noOfFans = 0;
   int speed = SLOW;
   boolean isOn = false;
   double radius = 5;
   String color ="Blue";
   String manufacturer ="WhirlWind";
   String  productId  = "xxx";

    public Fan(){
      noOfFans += 1;    
    }

    public Fan(int speed,double radius,String color,boolean isOn){
      noOfFans += 1;
      this.speed = speed;
      this.radius = radius;
      this.color = color;
      this.isOn = isOn;   
      productId = generateProductId();
      
    }

    public String toString(){
      String result = "";
      if(isOn == true)
        result = "Fan Speed is: " + speed + " Color is: " + color + " Radius is:" + radius + " Fan is On";
       else
       result = "Color is:" + color + " Radius:" +  radius + " FAN IS OFF";
      return result;
     }


    public int getNoOfFansCreated(){
      return noOfFans;
    }
   
  

   public String generateProductId(){   
     String result = "";
     String str = "abcdefghijklmnopqrstuvwxyz123456789";
     
    for(int i=0; i<10;i++){

       //char a = (char)(97 + Math.random()*25);
       //int b = (int)(49 + Math.random()*8);
      
     String rn = ""+ str.charAt((int)(1+Math.random()*34));
       result += rn;
      
    }
     
     
     return result;
   }

 
   

   


    
  
    
 }

 


