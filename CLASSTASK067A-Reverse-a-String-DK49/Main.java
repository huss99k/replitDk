import java.util.*;
class Main {
  public static void main(String[] args) {
    

    System.out.println(reverse("hello")); // "olleh"

      
  }


    public static String reverse(String str){
         String result = "";
      if (str == null || str.equals("")) {
            return str;
        }

       char[] sb = new char[str.length()];
      Stack<Character> stack = new Stack<>();

          for(int i =0 ; i <str.length();i++){
            stack.push(str.charAt(i));
          }

         int j = 0;

        while(!stack.isEmpty()){
          sb[j++] = stack.pop();   
        }

        result = Arrays.toString(sb);

      return result;
    }



       

}

 
