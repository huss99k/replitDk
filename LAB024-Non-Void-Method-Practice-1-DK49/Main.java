class Main {
	
	
	
	
	public static void main(String[] args){
	// Uncomment the lines below and run the program to test your method

  	// System.out.println(intMax(1, 2, 3)); //should print 3
		 //System.out.println(intMax(1, 3, 2)); //should print 3
     //System.out.println(intMax(3, 2, 1)); //should print 3
    // System.out.println(intMax(-3, -1, -2)); //should print -1

      intMax(-120,-349,-67);
	}
    public static int intMax(int a,int b,int c){

      
      int greaterNum =(Math.max(c, Math.max( a,b)));

      System.out.println(greaterNum);


       return greaterNum;


    }


    // create your method here



}