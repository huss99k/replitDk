import java.util.*;
class Main {
  public static void main(String[] args) {

    //TESTS
   System.out.println( wordLen(new String[] {"a", "bb", "a", "bb"})  );
   System.out.println( wordLen(new String[] {"this", "and", "that", "and"})  );
   System.out.println( wordLen(new String[] {"code", "code", "code", "bug"})  );

   
    
  }


  public static Map<String, Integer> wordLen(String[] words){

      Map<String , Integer> result = new HashMap<String,Integer>();
      for(int i = 0; i < words.length ; i++){

      int l = words[i].length();
        String temp = words[i];

        result.put(temp, l);
        
      }
         
    
       

    return result;
  }
}