class Main {
	
	
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countA("aaA")); //3
		System.out.println(countA("aaBBdf8k3AAadnklA")); //6
	}

  public static int countA(String s){

    int result = 0;

    
    for(int i = 0; i< s.length(); i++){
      
          if(s.charAt(i) == 'a' | s.charAt(i) == 'A')
             result = result + 1;
         
            
      
    }

    return result;
  }

}