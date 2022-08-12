class Main {
  public static void main(String[] args) {

        //getBMIMessage(90, 1.8);    //overweight
        //getBMIMessage(70, 1.72);   //normal
        getBMIMessage(55, 1.8);    //underweight
        //getBMIMessage(100, 1.78)  //obese

  }


  public static String getBMIMessage(double weight,double height){

     String result;

    double BMI = weight / (height * height);

    if (BMI < 18.5){
      result = "Underweight";
       System.out.println(result);
      
    }else if(18.5 <= BMI && BMI < 25.0 ){
      result = "normal";
      System.out.println(result);
    }else if(25.0 <= BMI && BMI < 30.0){
      result = "Overweight";
      System.out.println(result);
    }else result ="obese";
       
       return result;
    
       
    
  
    
    
    }
  }
  //create a method here
