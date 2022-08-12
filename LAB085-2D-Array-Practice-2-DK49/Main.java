class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{5,2,3,7},
			{1,5,2,2},
			{1,2,3,4}
		};
		System.out.println(sumRow(a,2)); //should print 10
		System.out.println(sumRow(a,0)); //should print 17
	}
	public static int sumRow(int[][] arr, int row){
     int result = 0;

     int column = arr[row].length;
     
     for(int i = 0; i < column; i++){

       result += arr[row][i];       
       
     }


    
    
    
		return result;
	}
}