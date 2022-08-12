public class Student{
  
  private String firstName;
  private String lastName;
  private String id;

   public Student(){}

  public Student(String firstName,String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
      
}

  public String getfirstName(){
    return firstName;
  }

  public String getlastName(){
    return lastName;
  }

  public String getid(){
    return id;
  }

  public void setfirstName(String firstName){
    this.firstName = firstName;
    }

  public void setlastName(String lastName){
    this.lastName = lastName;
    }

  public void setid(String id){
    this.id = id;
    }

   public String generateid(){
     return "";
   }

  public String toString(){
    return ""+firstName+" , "+lastName;
 }

  
  