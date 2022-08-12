class Main {
	
	
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(sumEvenToX(5)); //6
		System.out.println(sumEvenToX(8)); //20
	}

  public static int sumEvenToX(int x){

    int result = 0;

    for(int i = 0; i<=x; i++){

      if(i%2==0)
        result += i;
    }

    return result;
  }

}