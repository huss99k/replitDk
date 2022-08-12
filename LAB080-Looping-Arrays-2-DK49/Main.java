class Main {
  public static void main(String[] args) {
    //Tests
    System.out.println(sumElements(new int[] {1,2,3,4,5})); // -> 15
    System.out.println(sumElements(new int[] {1,1,1,1,1,1}));// -> 6
    System.out.println(sumElements(new int[] {0,10,100})); // -> 110
    System.out.println(sumElements(new int[] {77})); // -> 77
  }

  public static int sumElements(int[] arr){
    int result  = 0;

     for(int i = 0; i < arr.length;i++){
       result += arr[i];
       
     }
    
 
    return result;
  } 
}