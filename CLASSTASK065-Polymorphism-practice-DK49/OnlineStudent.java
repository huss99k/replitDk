public class OnlineStudent extends Student{

  private  String state;

  public OnlineStudent(String firstName,String lastName,String state){
    this.state = state;

    firstName = getfirstName();
    lastName = getlastName();
    setid(generateid());
  
  }

  public String generateId(){
    
  return "" +super.firstName +
  }

  
}