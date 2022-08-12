//Create and implement the class

 public class Averager {

    int sum = 0; // doesn't need intialize as instance variable have default values.
    int count = 0;


   public int getSum(){

     return sum;
   }
     public void add(int i){
        sum += i;
       count = count+1;
     }

   public int getCount(){

     return count;
   }

   public double getAverage(){

   return (double)count+sum/2;

     }
 }