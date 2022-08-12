class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
		System.out.println(sumColumn(a,1)); //should print -9
		System.out.println(sumColumn(a,3)); //should print 5
	}
	public static int sumColumn(int[][] arr, int column){
    int result = 0;
     int ln = column;

      for(int i = 0,j = ln; i < arr.length; i++){
        
           
          int temp = arr[i][j];
           result += temp;
          
        
      }



    return result;
		
	}
}