class Main {
  public static void main(String[] args) {
   
    // Test your class

    Company obj1 = new Company("kensington");
      obj1.setExpenses(25000.99);
      obj1.setnumberOfEmployees(72);
      obj1.setRevenue(40000);

     System.out.println(  obj1.getCompanySize());
  }
}