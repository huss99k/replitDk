public class GasTank{


   double amount = 0;
   double capacity;


   public GasTank(double capacity){
     this.capacity += capacity;
   }

  public void addGas(double x){
    if(x+amount <= capacity){
      amount += x;
    }else 
           amount = capacity;   
  }

   public void useGas(double y){
     if(amount-y <= 0){
       amount = 0;
     }
     amount -= y;
   }

   public boolean isEmpty(){
     if(amount < 0.1)
       return true;
     else 
          return false;
   }

   public boolean isFull(){
     if(amount > capacity-0.1)
       return true;
     else 
        return false;
     }

   public double getGasLevel(){
     return amount;
   }
  
  public double fillUp(){
    double result = capacity - amount;

   for(int i = 0; i<=capacity;i++){
     amount++;
   }

    return result;
  }
  
}