 public class Employee{

  private int  employeeId;
  private String firstName;
  private String lastName;
  private String department;
  private int annualSalary;

   public Employee(int employeeId,String firstName,String lastName){
     this.employeeId = employeeId;
     this.firstName = firstName;
     this.lastName = lastName;
   }

   public int getemployeeId(){
     return employeeId;
   }

    public int getSalary(){
     return annualSalary;
   }

    public String getfirstName(){
     return firstName;
   }

   public String getlastName(){
     return lastName;
   }

   public String getdepartment(){
     return department;    
   }

   public void setfirstName(String firstName){
     this.firstName = firstName;
   }

 
   public void setlastName(String lastName){
     this.lastName = lastName;
   }

 
   public void setdepartment(String department){
     this.department = department;
   }

  public void setSalary(int annualSalary){
    this.annualSalary = annualSalary;
  }  

   public void setemployeeId(int employeeId){
    this.employeeId = employeeId;
  }  


   public void  raiseSalary(double percent){

      double result = 0;
     result = (annualSalary/100);
     result = result * percent;
       annualSalary += (int)result;
   }
  
}