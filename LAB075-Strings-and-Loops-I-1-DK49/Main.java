import org.junit.rules.ExternalResource;

class Main {
  public static void main(String[] args) {

      System.out.println(alternative("powerful"));
    
      }

  public static String alternative(String str){  // Don't change anything on this line

      char temp = str.charAt(0);
      String result = Character.toString(temp).toLowerCase();
         String str1 = "";
        
       // for(int j = 1;j<str.length(); j++){
        //if(j%2==0)
        // str1 = Character.toString(str.charAt(j));
          
        //}

       
        
       for(int i = 1; i< str.length(); i++){
            if(i%2==1 & (str.charAt(i) >= 'a' | str.charAt(i) <='z')){
             temp = (char)(str.charAt(i) - 32); 
           result += temp;
           }else if(i%2==1 & str.charAt(i) >= 'A' | str.charAt(i) <= 'Z'){
                    temp = (char)(str.charAt(i) + 32);
                   result += temp;
             
                 
              } else
          result += Character.toString(str.charAt(i));
         }
      
      result += str1;

    return result;
  }

}