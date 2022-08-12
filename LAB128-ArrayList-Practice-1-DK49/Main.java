import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
	public static void main(String[] args){
		
    List<String> list1 = Arrays.asList("hey", "yo");
    List<String> list2 = Arrays.asList("what", "up");

    System.out.println(combineTwo(list1, list2)); // [hey, yo, what, up]

    List<String> list3 = Arrays.asList("hi", "hello");
    List<String> list4 = Arrays.asList("how", "do", "you", "do");

    System.out.println(combineTwo(list3, list4)); // [hi, hello, how, do, you, do]

      

	}

  public static List<String> combineTwo(List<String> wordList1, List<String> wordList2){
   // implement

           int l1 = wordList1.size();
           int l2 = wordList2.size();
           int l3 = l1 + l2;
    
           List<String> list  = Stream.of(wordList1, wordList2)
                                        .flatMap(x -> x.stream())
                                        .collect(Collectors.toList());
           
             
           
                    

                
      



    
    return list;
  }
}