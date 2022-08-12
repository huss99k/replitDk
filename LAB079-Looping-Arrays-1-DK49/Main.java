class Main{
	public static void main(String[] args){
		
    //Declare an integer array of size 5 and assign the values 10, 20, 30, 40, and 50 to it.

    //Then use a for loop to print out all the elements of the array, one per line.
		
		 int [] inp = new int[5];
       inp[0] = 10;
       inp[1]  = 20;
       inp[2] = 30;
       inp[3] = 40;
       inp[4]  = 50;
           int np = inp.length;
       for(int i = 0; i <= np ;i++){
          System.out.println("" + inp[i]);
         
       }
	}
}