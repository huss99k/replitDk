class Main {
	public static void main(String[] args)
	{
		int[][] a = {
			{1,1,1},
			{1,1,1},
			{1,1,1}
		};
		System.out.println(isSquare(a)); //true
		
		int[][] b = {
			{1,1,1,1},
			{1,1,1,1},
			{1,1,1,1}
		};
		System.out.println(isSquare(b)); //false
	}
	public static boolean isSquare(int[][] arr){
     boolean result  = false ;
    int temp01 = 0;
      int temp = 0;

     for(int i = 0; i < arr.length; i++){
       for(int j = 0; j < arr[i].length; j++){

            temp += i;
            temp01 += j;
             

         
       }
     }


     if( temp01 == temp)
         result = true;



    return result;
	}
}