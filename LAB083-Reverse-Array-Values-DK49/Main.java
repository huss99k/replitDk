import java.util.*;
class Main {
  public static void main(String[] args) {
      
      //TESTS
   reverse(new char[] {'a', 'b', 'c'}); //-> [c, b, a]
   reverse(new char[] {'c', 'i', 'v', 'i', 'c'}); // -> [c, i, v, i, c]
   reverse(new char[] {'j', 'a', 'v', 'a'}); // -> [a, v, a, j]
   reverse(new char[] {'y', 'o'}); //  -> [o, y]
   reverse(new char[] {'o'}); // -> [o]
  }


  public static void reverse(char[] arr){
    //method implementation here

       int ln = arr.length-1;
      char[] tp = new char[ln+1];
    
    for(int i = ln,j = 0;i >= 0;i--,j++){
          tp[j] = arr[i];
               
        // arr[i] = arr[j];
        //arr[j] = temp;
    
    }
     System.out.println(Arrays.toString(tp));
       
     
  }
}