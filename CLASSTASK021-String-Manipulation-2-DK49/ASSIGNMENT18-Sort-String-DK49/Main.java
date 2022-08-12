import java.util.*;
class Main {
  public static void main(String[] args) {

    //tests
    
   System.out.println(sortString("helloworld")); //dehllloorw
   System.out.println(sortString("javascript"));  //aacijprstv
   System.out.println(sortString("algorithm"));  //aghilmort
   System.out.println(sortString("barack"));  //aabckr
   System.out.println(sortString("parviz")); //aiprvz
   System.out.println(sortString("stamlo")); // almost
  }


  public static String sortString(String str){
       //implement
      char charArray[] = str.toCharArray();
    int  size = charArray.length;
      for(int i = 0; i < size; i++ ) {
         for(int j = i+1; j < size; j++) {
            if(charArray[i]>charArray[j]) {
           char   temp = charArray[i];
               charArray[i] = charArray[j];
               charArray[j] = (char) temp;
            }
         }
      }
      System.out.println("Third largest element is: " + Arrays.toString(charArray));

      
        return String.valueOf(charArray);

    }
}