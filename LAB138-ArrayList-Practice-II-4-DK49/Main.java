import java.util.*;

class Main {
  public static void main(String[] args){
        List<Integer> l1 =  new ArrayList<>(Arrays.asList(11, 200, 43, 84, 9917, 4321, 1, 33333, 8997));
        List<Integer> l2 =  new ArrayList<>(Arrays.asList(987, 1234, 9381, 731, 43718, 8932));
        List<Integer> l3 =  new ArrayList<>(Arrays.asList(34070, 1380, 81238, 7782, 234, 64362, 627));

             System.out.println(findLargest(l1));
             System.out.println(findLargest(l2));
             System.out.println(findLargest(l3));

  }


  public static Integer findLargest(List<Integer> integerList){
		  Integer l = 0;
      Integer result = integerList.get(0);
      for(int i = 1; i < integerList.size(); i++){
        
           l = integerList.get(i);
          if(l > result){
             result = l;
          } 
      }

       

    
		return result;
	}
}