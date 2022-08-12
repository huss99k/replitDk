class Main {
	
	
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(sumToX(5)); //15
		System.out.println(sumToX(7)); //28
	}

   public static int sumToX(int x){

     int result = 0;

     for(int i = 1;i <= x;i++){

         
       result = result + i;
     }

     return result;
     
   }
  //Write your method here

}