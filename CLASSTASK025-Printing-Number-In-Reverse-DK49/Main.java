class Main {
  public static void main(String[] args) {

   printReverse(123456);

    
  }

  public static void printReverse(int num){

   int reversed = 0;
      
     while(num!=0){
       int digit = num % 10;
      reversed = reversed * 10 + digit;
       num /= 10;
       
    }

    System.out.println(reversed);
    

  }

}