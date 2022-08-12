import java.util.*;
class Main {
  public static void main(String[] args) {
    //TESTS

  swapValues(new double[] {2.5, 5.0}); // -> [5.0, 2.5]
  swapValues(new double[] {0.0, 1.0}); //  -> [1.0, 0.0]
  swapValues(new double[] {99, 9}); // -> [9.0, 99.0]
  swapValues(new double[] {10.1, 19.3}); // -> [19.3, 10.1]
  }

  public static void swapValues(double [] arr){
     
   
          int i = 0;
          int j = 1;
    do{
       double temp = arr[i];
        arr[i] =  arr[j]; 
          arr[j] = temp;
             i++;
             j++;
             
      }while(j < arr.length);{  
      }
      System.out.println(Arrays.toString(arr));
    
    }
}