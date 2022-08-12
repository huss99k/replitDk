import java.util.Arrays;

class Main {
  public static void main(String[] args) {
  

      int[][] arr = { {1,2,3},
                      {4,5,6},    
                      {1,0,1}, // row with min sum
                    };

     System.out.println(Arrays.deepToString(swapFirstRowWithMinRow(arr)));


                     {1,0,1};
                     {4,5,6};    
                     {1,2,3};
                      
                  

                

  }


  public static int[][] swapFirstRowWithMinRow(int[][] arr){


   


        //array for the sums of the rows
        int[] sums = new int[a.length];
        
        int rowSum = 0;
        for (int i = 0; i < a.length; i++) {
            //reset the sum back to zero
            rowSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                rowSum += a[i][j];
            }
            //add the sums of each row to the sums array
            sums[i] = rowSum;


        }
        //to keep track of the index
        int minRowIndex = 0;
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] == rowSum)
                //index is the i value that makes this if condition true
                minRowIndex = i;
        }

        //swap first and min row
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int temp = a[0][j];
                a[0][j] = a[minRowIndex][j];
                a[minRowIndex][j] = temp;
            }
        }
        return a;

    }
    
   // return null;
  //}
}