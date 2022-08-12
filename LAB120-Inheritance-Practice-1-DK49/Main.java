class Main {
  public static void main(String[] args) {

       CalculatorWithMemory obj = new CalculatorWithMemory();
       // obj.setAccumulator(10.0);
       // obj.setMemory(3.0);

        obj.save();
        obj.recall();
      System.out.println(obj.getAccumulator());
      System.out.println(obj.getMemory());
        
  }
}