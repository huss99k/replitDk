class Main {
	
	
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countVowels("obama")); //3
		System.out.println(countVowels("happy friday! i love weekends")); //9
	}


  public static int countVowels(String s){


    int result = 0;

    for(int i = 0; i < s.length(); i++){


      if(s.charAt(i) == 'a' | s.charAt(i) == 'e' | s.charAt(i) == 'i' | s.charAt(i) == 'o' | s.charAt(i) == 'u')
             result = result + 1;
      if(s.charAt(i) == 'A' | s.charAt(i) == 'E' | s.charAt(i) == 'I' | s.charAt(i) == 'O' | s.charAt(i) == 'U')
             result = result + 1;
      
      
    } 

     return result;
    
  }

}