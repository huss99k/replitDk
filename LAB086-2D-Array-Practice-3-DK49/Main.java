class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
		};
		System.out.println(max2Delement(a)); //should be 8
	}
	public static int max2Delement(int[][] nums){
		 int result = nums[0][0];
      
     for(int i = 0; i < nums.length;i++){   
       for(int j = 0; j < nums[i].length;j++){
                  
         if(nums[i][j] > result )
             result = nums[i][j];
       }
     }


    return result;
	}
}