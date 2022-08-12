class Main {
  public static void main(String[] args) {
    //Test here

  }


  //create your method here

  public static String returnDoubleUppercased(String str){

    String result = "";

    for(int i=0;i < str.length();i++){

      result = ""+Character.toUpperCase(str.charAt(i)) + Character.toUpperCase(str.charAt(i));
      
    }

    return result;
  }
}