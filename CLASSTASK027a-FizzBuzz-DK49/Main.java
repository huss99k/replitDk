class Main {
  public static void main(String[] args) {
    // Use loops to print numbers from 1 to 100
    // If a number is a mutiple of 3, print Fizz
    // If a number is multiple of 5, print Buzz
    // If a number is multiple of 3 and 5, print FizzBuzz


     

    for(int num = 100,i=1;i<=num;i++){

      if(i%3==0 & i%5==0)
        System.out.println("fizzbuzz");
      else if(i%3==0)
        System.out.println("fizz");
      else if(i%5==0)
         System.out.println("buzz");
      else
           System.out.println(i);
    }







    
    // Example:
    /* 
      1
      2
      Fizz
      4
      Buzz
      Fizz
      7
      8
      Fizz
      Buzz
      11
      Fizz
      13
      14
      FizzBuzz
      .
      .
      98
      Fizz
      Buzz
    */



  }
}