import java.util.*;

class Main {

public static void main(String[] args){

   ArrayList<String> list1 = new ArrayList<>();
   list1.add("hello");
   list1.add("hi");
   list1.add("what");
   list1.add("who");
   addYo(list1);
   System.out.println(list1); // [hello, yo, hi, yo, what, yo, who]

    ArrayList<String> list2 = new ArrayList<>();
   list2.add("hello");
   list2.add("what");
   list2.add("who");
   addYo(list2);
   System.out.println(list2); // [hello, yo, what, yo, who] 

   ArrayList<String> list3 = new ArrayList<>();
   list3.add("hello");
   list3.add("what");
   addYo(list3);
   System.out.println(list3); // [hello, yo, what]

}


	public static void addYo(ArrayList<String> words) {
  //  implement here:
    //        if(words.size() >= 1 | !words.isEmpty() == true){            
    //     words.add(1,"yo"); 
    // }

    
		    for(int i = 0; i <= words.size()-1;i++){
                if(i % 2 == 1)
                   words.add(i,"yo");
        }






    
  }
}