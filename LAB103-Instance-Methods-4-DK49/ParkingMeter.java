

//Create and implement the class here
  public class ParkingMeter{

    int timeLeft = 0;


    public boolean add(int time){
       boolean result = false;
      if(time == 25){
        timeLeft += 30;
          result = true;
        } 
      
      return result;
    }

    public void tick(){
      if(timeLeft > 0)
        timeLeft -= 1;
  
    } 

     public boolean isExpired(){
       boolean result = false;
       if(timeLeft == 0)
         result =  true;

       return result;
  
     }

        public double value(){

          return timeLeft;
        }

    
  }