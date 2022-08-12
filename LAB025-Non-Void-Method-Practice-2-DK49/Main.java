class Main {
	
		
	
	public static void main(String[] args){
   // Uncomment  the following lines to test your method
    
     getLastDigit(23); //should print 3
     //System.out.println(getLastDigit(123526)); //should print 6
     //System.out.println(getLastDigit(10)); //should print 0
     //System.out.println(getLastDigit(5)); //should print 5

	}

   
   
     public static int getLastDigit(int num1){
       System.out.println(num1%10);
       return (num1%10);
     }

}