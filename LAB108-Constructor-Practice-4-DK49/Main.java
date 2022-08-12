class Main {
  public static void main(String[] args) {
    
    //Test your class by creating an object using the constructor, acccessing the instance variables, calling the methods

    
    GasTank obj1 = new GasTank(18.7);

     obj1.addGas(8.5);
     obj1.useGas(6.1);
     System.out.println(obj1.isEmpty());
     System.out.println(obj1.isFull());
     System.out.println(obj1.getGasLevel());
     System.out.println(obj1.fillUp());
     System.out.println(obj1.getGasLevel());
       
    
     
  }
}