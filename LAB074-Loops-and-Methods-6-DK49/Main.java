class Main {
	
	
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(keepVowels("hello")); //eo
		System.out.println(keepVowels("how do i internets")); //ooiiee
	}


     public static String keepVowels(String s){

       String result = "";

       for(int i = 0; i<s.length() ; i++){

         if(s.charAt(i) == 'a')
           result += 'a';
          else if( s.charAt(i) == 'A' )
            result += 'A';
           else if (s.charAt(i) == 'e') 
             result += 'e';
          else if  ( s.charAt(i) == 'E') 
            result += 'E';
          else if ( s.charAt(i) == 'i') 
            result += 'i';
           else if (s.charAt(i) == 'I') 
              result += 'I';
           else if (s.charAt(i) == 'o') 
             result += 'o';
           else if  (s.charAt(i) == 'O') 
             result += 'O';
          else if ( s.charAt(i) == 'U' )
            result += 'U';
          else if  (s.charAt(i) == 'u' )
             result += 'u';

              
           
            }

        return result;
         
         
       }
       
     }
