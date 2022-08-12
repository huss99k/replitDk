class Main {
  public static void main(String[] args) {
   
   // call your method here
  
   whatYouCanDo(55);
 
  }
  public static void whatYouCanDo(int age){


    if(age<16){

      System.out.println("U can't drive");
    }else if(age<=17){
     System.out.println("You can drive but not vote.");
    }else if(age<=24){
     System.out.println("You can vote but not rent a car.");
    }else if(age>=25){
     System.out.println("You can do pretty much anything.");
    }
  }
  
}
    


  //create your method here
