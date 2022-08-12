// Create and implement the class here

 public class GasTank{
   
   double amount = 0;

   
   public void  addGas(double i){
     amount += i;
   }

   
    public void useGas(double j){
      if(amount > 0 & j<amount)  
         amount  = amount - j;
       else 
            amount = 0;
    }

    public boolean isEmpty(){
    boolean result;
      if(amount<0.1)
        result = true;
      else 
          result = false;
      return result;
    }


    public double getGasLevel(){

      return amount;
    }
 }