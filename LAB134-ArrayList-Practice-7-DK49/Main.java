import java.util.ArrayList;

class Main{
	public static void main(String[] args){
    
			ArrayList<String> list = new ArrayList<>();
      list.add("hello");
      list.add("hi");
      list.add("que");
      list.add("paso");
      list.add("sup");

      everyOther(list);

      System.out.println(list); //[hi, paso]
	}
	
  
  public static void everyOther(ArrayList<String> nums){
    nums.remove(0);
     //    for(int i = 0; i < nums.size(); i+= 3){

     //       //   nums.remove(0);

     //         if(i % 2 != 0){
     //               nums.remove(i);
     //    }             
     // }   
         for(int i = 0; i < nums.size(); i++){

              nums.remove(i+1);
            

         }  
     }       
}