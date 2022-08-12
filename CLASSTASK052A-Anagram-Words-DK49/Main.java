import java.util.*;
class Main {
  public static void main(String[] args) {
System.out.println(isAnagram("abc","cab"));
    
  }


  public static boolean isAnagram(String str1, String str2){
      
    if (str1.length() != str2.length()) {
        return false;
    }
    char[] a1 = str1.toCharArray();
    char[] a2 = str2.toCharArray();
    Arrays.sort(a1);
    Arrays.sort(a2);
    return  Arrays.equals(a1, a2);
     

    
  }
}
