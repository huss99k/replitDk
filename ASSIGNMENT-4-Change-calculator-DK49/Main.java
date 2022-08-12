
class Main {
  public static void main(String[] args) {
    
java.util.Scanner sc = new java.util.Scanner(System.in);
				
	System.out.println("Please enter the amount: (e.g. 23.89) ");
		
	double  amount = sc.nextDouble();

  // DON'T CHANGE THE ABOVE CODE. 
  // Code to get user input has been written for you. Use the "amount" variable initialized above.
    
    String checkr = ""+amount;
      int ln = checkr.length();
    // System.out.println(ln);
       int p = 0;
       int n = 1;
     for(int i = 0;i < ln;i++){        
       if(checkr.charAt(i) == '.'){
           n += 1;
          break;
       } else
            p++;           
     }

            //System.out.println(++ln-p);    
       
        int decimalPointDigits = ((ln-p)-1); 
         // To Know dynamically how many decimal point digits are inthe input...
         // System.out.println(decimalPointDigits);
    
        System.out.println("Your Amount is: " + amount);  
      //  amount = Math.round(amount*100.0)/100.0;
     
    
     double result  = amount * 100;

     int dollars = (int) result / 100;
     result = (int) result % 100;
    
     int quarters = (int) result / 25;
     result = (int) result % 25;
    
     int dimes = (int) result / 10;
     result = (int) result % 10;

     int nickels = (int) result / 5;
     result = (int) result % 5;

     int pennies = (int) result / 1;
     result = (int) result % 1;
        
        
      
     System.out.println("Contains Dollars " + dollars);      
     System.out.println("Contains quarters " + quarters);
     System.out.println("Contains dimes " + dimes);
     System.out.println("Contains nickels " + nickels);
     System.out.println("Contains pennies " + pennies);
      


  }
}