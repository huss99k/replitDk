class Main {
  public static void main(String[] args) {
    //Tests

   // sort3Ints(55,89,-1); //->  1,2,3
    sort3Ints(2,3,2); //->  1,3,3
   //sort3Ints(-2,-10,-1); //->  -10,-2,-1
  // sort3Ints(99,78,22); //->  22,78,99
   // sort3Ints(0,-2,1); //->  -2,0,1
   //sort3Ints(7,0,0); //->  0,0,7
    //sort3Ints(5,5,5); //->  5,5,5
    
  }
 
 public static void sort3Ints(int num1,int num2,int num3){
  
  System.out.println("" + num1 +","+ num2 +","+ num3);

   if(  (num2> num1 && num1 <num3) && num2 <= num3 ){
     System.out.println(num1 + "," + num2 + "," + num3);
   }else if((num1>num3 && num3<num2) && num2 <=num1){
     System.out.println(num3 + "," + num2+","+num1);
   }else if((num1>num2 && num2 <num3) && num1 <=num3){
     System.out.println(num2 + "," + num1 + ","+ num3 );
   }else{
     System.out.println(num2 + "," + num3 + "," + num1);
   }


   
    
    

 


 }

  // create your method here


}