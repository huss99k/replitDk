public class CalculatorWithMemory extends Calculator{


  private double memory = 0;
   
   
   public void setMemory(double memory){
     this.memory = memory;
   }

  public double getMemory(){
    return memory;
  }

    public void save(){
      memory =  getAccumulator(); 
    } 

  public void recall(){
    setAccumulator(memory);
  }

  public void clearMemory(){
      memory = 0;
  }

 









  
}