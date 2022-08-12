 import java.util.*;

class Main {
  public static void main(String[] args) {
      String[] arr0 = new String[]{"Apple", "Orange", "Banana"};
      String[] arr1 = new String[]{"Red", "Orange", "Yellow"};
      String[] arr2 = new String[]{"Left", "Right", "Forward", "Back"};

           System.out.println(array2List(arr0));
           System.out.println(array2List(arr1));
           System.out.println(array2List(arr2));

    
  }


  public static ArrayList<String> array2List(String[] stringArray) {
        ArrayList<String> result =  new ArrayList<String>();

     for(int i = 0; i < stringArray.length; i++){  
            result.add(i,stringArray[i]);  
     }
    
		return result;
	}
}