import java.util.*;
class Main {
  public static void main(String[] args) {

       List<String> listy = Arrays.asList("purple", "green", "blue", "yellow", "green");
       List<String> listx = Arrays.asList("jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way");
       
           System.out.println(reverseList(listy));
           System.out.println(reverseList(listx));

  }


  public static List<String> reverseList(List<String> stringList) {
    List<String> result = new ArrayList<>();
       int l = stringList.size()-1;
           for(int i = l; i >= 0; i--){

             result.add(stringList.get(i));
                       
           } 
        
 		
		return result;
	}
}