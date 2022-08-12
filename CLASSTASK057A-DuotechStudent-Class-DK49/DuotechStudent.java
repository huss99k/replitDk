public class DuotechStudent{
 // implement based on the requirements
   
  String name;
  int age;
  String stateofResidence;
  boolean isOnline;
  int[] grades = new int[]{78,88,95};
  double tuition;


  public DuotechStudent(){
    this("potter",77,"bs",false,{78,99,90},7888.99);
  }


  public DuotechStudent(String name){
    this(name,78,"bs",true,)
    
  }

   public DuotechStudent(String name,int age,String stateOfResidence,boolean isOnline,int[] grades,double tuition){

     this.name ="Harry";
     this.age = 27;
     this.stateofResidence = "VA";
     this.isOnline = true;
     this.grades =  new int[]{67,89,90};
     this.tuition = 8999.99;
     
   }


    public String getInfo(){

      return name+" " +age+ " " +stateOfresidence;
    }

    public double getAverageGrade(){
      double result = 0;
      double sum = 0;
      for(int i = 0; i<grades.length,i++){
        sum += grades[i];
      }
       result = sum/2;
        
      return result;
    }

   public double payTuition(double amount){

     double result =0;
      result  = amount - tuition;
     return result;
   }


   public double getTuition(){
     return tuition;
   }

  

 


}