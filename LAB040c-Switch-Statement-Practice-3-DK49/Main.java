class Main {
  public static void main(String[] args) {
    //TESTS
   // displayDaysOfMonth(1,2020);// January 2020 has 31 days
    displayDaysOfMonth(2,2016);// February 2016 has 29 days
    //displayDaysOfMonth(2,2021);// February 2021 has 28 days
   // displayDaysOfMonth(4,2000);// April 2000 has 30 days
    //displayDaysOfMonth(12,2019);// December 2019 has 31 days
    //displayDaysOfMonth(9,1999);// September 1999 has 30 days
  }



  public static void displayDaysOfMonth(int month, int year){
    //implement the method here
       if(( year%4==0 | year%400==0 ) && month==2){
              System.out.println("February " + year + " has 29 days");
         }else if(year>0){ 
                System.out.print("");
         }else{
      switch (month){
          
          case 1: System.out.println("January " + year + " has 31 days");
          break;
          case 2: System.out.println("February " + year + " has 28 days");
          break;
          case 3: System.out.println("March " +year+ " has 31 days");
          break;
          case 4: System.out.println("April " +year+ " has 30 days");
          break;
          case 5: System.out.println("May " +year+ " has 31 days");
          break;
          case 6: System.out.println("June " +year+ " has 30 days");
          break;
          case 7: System.out.println("July " +year+ " has 31 days");
          break;
          case 8: System.out.println("August " +year+ " has 31 days");
          break;
          case 9: System.out.println("September " +year+ " has 30 days");
          break;
          case 10: System.out.println("October " +year+ " has 31 days");
          break;
          case 11: System.out.println("November " +year+ " has 30 days");
          break;
          case 12: System.out.println("December " +year+ " has 31 days");
          break;
      }
      
          




          
      }

        
    
  }
}