import  java.util.*;

class Main {
  public static void main(String[] args) {

        List<String> l1 = new ArrayList<>(Arrays.asList("Apple", "Orange", "Banana"));
        List<String> l2 = new ArrayList<>(Arrays.asList("Red", "Orange", "Yellow"));
        List<String> l3 = new ArrayList<>(Arrays.asList("Left", "Right", "Forward", "Back"));

          System.out.println(Arrays.toString(list2Array(l1)));
          System.out.println(Arrays.toString(list2Array(l2)));
          System.out.println(Arrays.toString(list2Array(l3)));
  
   
  }

  public static String[] list2Array(List<String> stringList) {

             String[] result =  new String[stringList.size()]; 

        result = stringList.toArray(result);

     for(int i = 0; i < stringList.size(); i++){ 
       // if(result[i] == null)
       //        result[i].replace("null",stringList.get(i));

            result[i] = "";      
          result[i] += stringList.get(i);
        

     }


    
	
		return result;
	}
}