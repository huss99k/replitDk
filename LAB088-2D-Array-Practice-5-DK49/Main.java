class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
		System.out.println(diffHiLo(a)); //should print 12
	}
	public static int diffHiLo(int[][] arr){
		int result = 0;
     int l = arr[0][0];
     int  h = arr[0][0];
    
       for(int i = 0; i < arr.length; i++){
         for(int j = 1; j < arr[i].length;j++){
             

              if(h < arr[i][j])
                h  = arr[i][j];
           
           if( l > arr[i][j])
               l = arr[i][j];
                     

        //   if(l > arr[i][j] & l < 0){
          //    l = arr[i][j];
           //}
                // result = l - h;
    
         }
       }
            System.out.println(l+""+ h);
    
        result = h - l;
      // result =  Math.abs(result);

    return result;
	}
}