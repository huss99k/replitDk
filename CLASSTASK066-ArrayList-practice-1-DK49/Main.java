import java.util.*;

class Main {
  public static void main(String[] args) {
   
  
    ArrayList<String> list = new ArrayList<>();

        System.out.println(list.add("java"));
        System.out.println(list.add("hello"));
        System.out.println(list.add("hi"));

     System.out.println(manipulate(list));
   
   // test the method here by passing the above arraylist
   
    


  }

  // Create the method here
 
 // Create a method that accepts an ArrayList<String>  and processes the ArrayList so that each String in that arraylist is pig latined (move the first letter to the end and add "ay")
 // and returns the ArrayList
 //  {"java", "hello", "hi"} -> {"avajay", "ellohay", "ihay"}



  public static ArrayList<String> manipulate(ArrayList<String> list){
      String str = "";
      String temp= "";
     ArrayList<String> result  = new ArrayList<>();
    
    if(list.isEmpty() == true)
       return null;

    for(int i = 0; i <= list.size() - 1; i++) {
      temp = list.get(i);
               
       str = temp.substring(1) + temp.charAt(0) + "ay ";
         result.add(i,str);
                }
           
            
        
    
    return result;
  }
}

