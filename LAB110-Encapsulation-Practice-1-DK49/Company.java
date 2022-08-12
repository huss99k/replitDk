public class Company{

 private String name;
 private int numberOfEmployees;
 private int revenue;
 private double expenses;

  public Company(String name){
    this.name = name;

  }
    public void setName(String name){
      this.name = name;
    }

    public String getname(){
     return name;
   }

    public void setnumberOfEmployees(int numberOfEmployees){
      this.numberOfEmployees = numberOfEmployees;
    }

    public int getnumberOfEmployees(){
      return numberOfEmployees;
    }

     public void setRevenue(int revenue){
      this.revenue = revenue;
    } 

       public  int getRevenue(){
        return revenue;           
  }


   public void setExpenses(double expenses){
     this.expenses = expenses;  
   }

    public double getExpenses(){
      return expenses;
    }

   public String getCompanySize(){
      String result = "";
      if(numberOfEmployees <= 50){
        result = "small";
      }else if(numberOfEmployees >50 & numberOfEmployees <= 250)
        result = "medium";
         result = "large";

     return result;
   }

   public double getProfit(){

     double result = 0.0;
     result =  revenue - expenses;
     return result;
   }

  

  
  






  
}