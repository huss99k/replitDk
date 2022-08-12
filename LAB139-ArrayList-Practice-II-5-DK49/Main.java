import java.util.*;
class Main {
  public static void main(String[] args) {
      //Test your method here

    List<Integer> l0 = new ArrayList<>(Arrays.asList(5, 7, 9, 5, 11));
    List<Integer> l1 = new ArrayList<>(Arrays.asList(6, 8, 10, 11, 13));
    List<Integer> l2= new ArrayList<>(Arrays.asList(9, 23, 44, 2, 88, 44));


     System.out.println(foundIntTwice(l0,6));
     System.out.println(foundIntTwice(l1,8));
     System.out.println(foundIntTwice(l2,44));

    
  }

  public static boolean foundIntTwice(List<Integer> integerList, int intToFind) {
    boolean result = false;
       int count = 0;
  
        for(int i = 0; i < integerList.size();i++){
              if(integerList.get(i) == intToFind){
                count += 1;
              }        
        }

        if(count > 1)
            result = true;
    




    
		
		return result;
	}


}