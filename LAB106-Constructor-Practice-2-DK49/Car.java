
 public class Car{

   String make;
   String model;
   int numberOfDoors;
   int topSpeed;
   double price;


  public Car(){}

   public Car(String make,String model,int topSpeed,double price){
     this.numberOfDoors = 4;
     this.make = make;
     this.model = model;
     this.topSpeed = topSpeed;
     this.price = price;
  }

   public Car(int topSpeed,double price,int numberOfDoors){
     this.make = "unknown";
     this.model = "unknown";
     this.topSpeed = topSpeed;
     this.price = price;
     this.numberOfDoors = numberOfDoors;
   }

    public Car(String make,String model,int numberOfDoors){
      this.topSpeed = 90;
      this.price = 0;
      this.make = make;
      this.model = model;
      this.numberOfDoors = numberOfDoors;
      
    }
 }
