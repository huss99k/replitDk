
class Main{
	public static void main(String[] args) {

     Car obj = new Car();
     Car obj0 = new Car("suzuki","khyber",86,670800);
     Car obj1 = new Car(130,1899.99,2);
     Car obj2 = new Car("mazda","Cx9",5);


     System.out.println( "Object 1 : " + obj.make + " ," + obj.model+" ," + obj.numberOfDoors + " ," + obj.topSpeed + " ," +obj.price);
     System.out.println( "Object 2 : " + obj0.make + " ," + obj0.model+" ," + obj0.numberOfDoors + " ," + obj0.topSpeed + " ," +obj0.price);
     System.out.println( "Object 3 : " + obj1.make + " ," + obj1.model+" ," + obj1.numberOfDoors + " ," + obj1.topSpeed + " ," +obj1.price);
     System.out.println( "Object 4 : " + obj2.make + " ," + obj2.model+" ," + obj2.numberOfDoors + " ," + obj2.topSpeed + " ," +obj2.price);
	}
}