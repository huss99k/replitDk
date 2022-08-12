import java.util.*;

class Main {
  
  
  public static void main(String[] args) {
    
     List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('$');
        list.add('*');
        list.add('!');
        list.add('w');
        list.add('5');
        list.add('@');
        list.add('z');
        list.add('#');
        list.add('&');
        list.add('%');


        removeNonAlphaNumeric(list);
        System.out.println(list);  //   [a, w, 5, z]

  }

  public static void removeNonAlphaNumeric(List<Character> list){
    
  }
}