class Main {
  public static void main(String[] args) {


    int[] num = new int[30];
      // Random result = new R;

    int count = 0;
      for(int i = 0; i < num.length; i++){
        
        num[i] = (int)(Math.random()*101); 
         System.out.println(num[i] + " , ");

        if(num[i] == 11){
          count++;
        }
        System.out.println();
      }
            System.out.println("the count of 11 is : " + count);

    
    

   // Create an array with size 30 
   // fill the array with random values between 0-100
   // print your array content with for loop (You can also use Arrays.toString())
   // Also find how many times 11 occured in the array. 
    
  }
}