class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{1,1,1},
			{1,1,1},
			{1,1,1}
		};
		System.out.println(isMagic(a)); //true
		int[][] b = {
			{1,1,2},
			{3,2,3},
			{1,4,1}
		};
		System.out.println(isMagic(b)); //false
		int[][] c = {
			{1,1,1},
			{2,2,2}
		};
		System.out.println(isMagic(c)); //false
		int[][] d = {
			{8,1,6},
			{3,5,7},
			{4,9,2}
		};
		System.out.println(isMagic(d)); //true
	}
	public static boolean isMagic(int[][] arr){
    boolean result01 = false;
      int r = 0;
      int c = 0;
     int rsum = 0;
     int csum = 0;
    int dsum = 0;
    
       for(int i = 0; i < arr.length; i++){
         for(int j = 0; j < arr[i].length; j++){
           
            rsum += arr[i][j];
            //csum += arr[0][j];
           
            dsum += arr[i][i];
            
             
           
           r += i;
           c += j;
           
         }
       }  

           for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){        
              
            csum += arr[i][j];
              
            }             
           }
          
           
        if((r == c) & (rsum == csum) & (csum == dsum) & (rsum == dsum))
             result01 = true;


         

      
      



    return result01;
	}
}