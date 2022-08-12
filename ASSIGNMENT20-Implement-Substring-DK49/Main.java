class Main {
  public static void main(String[] args) {
    //Test your methods

    char[] arr = {'h', 'e', 'l', 'l', 'o'};

       

  }

   public static char[] subArray(char[] arr,int b){
     char[] result ;
     for(int i =b; i<arr.length;i++){
         result = arr[i];
     }
       return result;
   }

}