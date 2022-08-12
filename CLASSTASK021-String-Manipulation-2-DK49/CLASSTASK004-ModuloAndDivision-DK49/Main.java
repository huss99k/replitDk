class Main {
  public static void main(String[] args) {
   
   int number =  5852; // 5*8*5*2 - (5+8+5+2) = 380
   
   int num1 = number % 10;
   System.out.println(num1);
    number = number / 10;
    int num2 = number % 10;
    number = number / 10;
     System.out.println(num2);

    int num3 = number % 10;
      number = number / 10;
       System.out.println(num3);

      int num4 = number % 10;
       number = number / 10;
        System.out.println(num4);

       int mult = num1*num2*num3*num4;

       int sum = (num1+num2+num3+num4);

       System.out.println("the result:" + (mult - sum));




       


    

    


   

   

   




  




  }
}