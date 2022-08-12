class Main {
  public static void main(String[] args) {
    //Test your methods by passing the given arrays
  
      int[] arr1 = {3,2,5,1,6};
      double[] arr2 = {2.3 ,6.1 , 9.1 , 2.9};

       System.out.println(getAverage(arr1));
       System.out.println(getAverage(arr2));
    
  }

     public static double getAverage(int[] array){
         
        double sum = 0;

       for(int i=0;i<array.length;i++){
         sum += array[i];
         
       }
          return sum/5;
       }
       
     public static double getAverage(double[] array){
         
        double sum = 0;

       for(int i=0;i<array.length;i++){
         sum += array[i];
         
       }
          return sum/4;
       }
}