class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
		System.out.println(sumEvenIndex(a)); //should print -8
	}
	public static int sumEvenIndex(int[][] arr){
     int result = 0;

         for(int i = 0; i < arr.length -1 ;i+= 2){
           for(int j = 0; j < arr[i].length -1;j += 2){

              int temp = arr[i][j];
                 result += temp;
             
               
             
           }
         }



    return result;
	}
}