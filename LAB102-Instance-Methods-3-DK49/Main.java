

class Main {
    
  public static void main(String[] args) {
    //Test your methods by creating an object, assigning value to instance variable and calling the methods


     GasTank obj = new GasTank();

    obj.amount = 18;
    obj.addGas(7.8);
    obj.useGas(9.2);
   System.out.println( obj.isEmpty());
    System.out.println(obj.getGasLevel());
    

    

    
    

    
    
  }
}