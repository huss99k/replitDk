class Main {
  public static void main(String[] args) {
    
    // Uncomment below and test your method 
  // getRandomCreditCardNo(0);
    //System.out.println(getRandomCreditCardNo(1)); 
  //  System.out.println(getRandomCreditCardNo(2)); 
  //  System.out.println(getRandomCreditCardNo(3)); 
  //  System.out.println(getRandomCreditCardNo(4));
   //  System.out.println(getRandomCreditCardNo(0));
    //  System.out.println(getRandomCreditCardNo(2330));


   getRandomCreditCardNo(2);
     
  }

  public static  void getRandomCreditCardNo(int numForCreditCardSelection){

    


    long random01 = (long)(299999999999999l + Math.random()*100000000000000l);
    long random02 = (long)(3999999999999999l + Math.random()*1000000000000000l);
    long random03 = (long)(4999999999999999l + Math.random()*1000000000000000l);
    long random04 = (long)(5999999999999999l + Math.random()*1000000000000000l);

   if( numForCreditCardSelection == 1){
    System.out.println("" + random01);
    }

    else if(numForCreditCardSelection == 2){
      System.out.println("" + random02);
    }

    else if(numForCreditCardSelection == 3){
      System.out.println("" + random03);
    }
    
   else if(numForCreditCardSelection == 4){
      System.out.println("" + random04);
    }
   
   else 
         System.out.println("0");
    





  }



  // create your method here



  
}