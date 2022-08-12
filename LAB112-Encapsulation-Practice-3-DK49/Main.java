class Main {
  public static void main(String[] args) {
    //Test your class implementation

     Employee obj = new Employee(6789,"Hussain","Ali");

       System.out.println(  obj.getfirstName());
       System.out.println( obj.getlastName());
       System.out.println( obj.getemployeeId());
       System.out.println( obj.getSalary()); 
       obj.setSalary(95000);
      System.out.println( obj.getSalary()); 

      obj.raiseSalary(2);
    System.out.println( obj.getSalary()); 
     
  }
}