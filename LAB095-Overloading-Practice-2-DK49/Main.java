import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    //Test your methods by passing the given arrays

    int [] arr1 = {1,2,3,4,5};

    char[] arr2 = {'h','e','l','l','o'};

    String[][] arr3 = { {"hey","what's","up"},   
                        {"hola","que","hondas"},    
                        {"como","te","vas"},        
                        {"how","do","you", "do"}    
                                };
                                

    long [][][] arr4 = {
      { {21,3,4,5},{11,33,44,22} },
      { {1,1,1},{2,1,2}, {3,1} },
      { {9,6},{5,5,5,5}, {99,4,21,11} },
    };


    printArray(arr1);
    printArray(arr2);
    printArray(arr3);
    printArray(arr4);         
    
  }

    public static void printArray(int[] array){

       for(int i = 0; i < array.length;i++){
        System.out.print(array[i] + " ");
         
       }
      }

          public static void printArray(char[] array){
            System.out.println();
          String result = "";
       for(int i = 0; i < array.length;i++){
       // System.out.print(array[i] );
          result = Character.toString(array[i]);
            System.out.print(result);
       }
             
       
    }

     public static  void  printArray(String[][] array){
        System.out.println();
        
       for(int i = 0; i<array.length;i++){
         for(int j=0; j<array[i].length;j++){
                  
           System.out.print(array[i][j] + " ");
         }
       }
     }

     public static void printArray(long[][][] array){

       System.out.println();
       for(int i = 0; i<array.length;i++){
         for(int j = 0; j<array[i].length;j++){
           for(int k = 0; k<array[i][j].length;k++){

             System.out.print(array[i][j][k] + " ");
           }
         }
       }
     }


}