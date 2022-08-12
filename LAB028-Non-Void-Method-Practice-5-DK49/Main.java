class Main {
  public static void main(String[] args) {
    //Uncomment the lines below to test your method
    
     System.out.println(average(5,7)); // 6.0
     System.out.println(average(2,7)); // 4.5
     System.out.println(average(11,2)); // 6.5
    
  }

  public static double average(double a,double b){

     System.out.println("You Entered :" + a +","+ b);
     double avg = ((a+b)/2);
      System.out.println("The Average is : ");
    return avg;
    

  //create your method here
}
}