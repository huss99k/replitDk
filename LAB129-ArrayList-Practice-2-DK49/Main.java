import java.util.*;


class Main{
	
  public static void main(String[] args){

    List<String> list  =  new ArrayList<>(Arrays.asList(new String[]{"java", "python", "java", "scala", "ruby", "clojure", "java"}));
    removeAll(list, "java");
    System.out.println(list); //[python, scala, ruby, clojure]


    List<String> list2  =  new ArrayList<>(Arrays.asList(new String[]{"java", "java", "java", "java", "java"}));
    removeAll(list2, "java");
    System.out.println(list2);  // []
		
	}

  public static void removeAll(List<String> list, String targetWord){
     //implement here

       // for(String li : list){
       //    if( li == targetWord){
       //          list.remove(li);
       //    }
         
       // }
              int l = list.size();


    for(int i = 0; i < list.size() ;i++){

         if( list.get(i).equals(targetWord)){
            list.remove(i);
         }  
    }   
          if( list.contains(targetWord))
                list.clear();

      



    
  }
}