class Main {
  public static void main(String[] args) {
   
    //Find the index of minimum element in an array

    int[] arr = {34,22,45,12,56,22,77,12};  // 3

    
     int index = 0;
     int min = arr[0];
       for (int i = 1; i < arr.length; i++) {
        
        if (arr[i] < min) {
            min = arr[i];
            index = i;
        }

        
      

    

    

  }  

     System.out.println(index);

    }

  
}