class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
		System.out.println(countNegativeOdd(a)); //should print 3
	}
	public static int countNegativeOdd(int[][] arr){
		int result = 0;

     for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){

        int temp = arr[i][j];
               if(temp / 2 == 0)
                  result = 0;
        else 
                 result += 1;
        
        
      }    
     }


    return result;
	}
}