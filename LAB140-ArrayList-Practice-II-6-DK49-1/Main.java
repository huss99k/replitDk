import java.util.*;
class Main {
  public static void main(String[] args) {

        Integer[] tempx = {1,2,3};
        Integer[] tempy = {4,5,6};
        Integer[] tempz = {7,8,9,10,11,12,13,14,15};

     System.out.println(fizzBuzzList(tempx));
     System.out.println(fizzBuzzList(tempy));
     System.out.println(fizzBuzzList(tempz));
    
    
  }


  public static List<String> fizzBuzzList(Integer[] integerArray) {
     List<String> result = new ArrayList<>();
          int temp  = 0;

       for(int i = 0; i < integerArray.length;i++){
                temp = integerArray[i];

         if((temp % 5 == 0) & (temp % 3 == 0)){
               result.add(i,"FizzBuzz");
            }else if(temp % 3 == 0){
               result.add(i,"Fizz");
            }else if(temp % 5 == 0){
               result.add(i,"Buzz");
            } else
                    result.add(i,integerArray[i].toString());    
       }       

		return result;
	}
}