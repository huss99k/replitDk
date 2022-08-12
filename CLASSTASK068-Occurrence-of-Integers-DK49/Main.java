import java.util.*;
class Main {
  public static void main(String[] args) {
   
  String str = "1 5 9 2 1 5 8 1";

  String[] nums = str.split(" ");
    
  // System.out.println(Arrays.toString(nums));

    
  Map <String, Integer> map = new HashMap<>();

  for (String num : nums) {

    if (!num.isEmpty()){

  if (!map.containsKey(num)){
      map.put(num,1);  
  }
  else {
    Integer count = map.get(num);
    count++;
    map.put(num, count);
  }
  }

   
      
    }

    
     System.out.println(map);
  
}
}