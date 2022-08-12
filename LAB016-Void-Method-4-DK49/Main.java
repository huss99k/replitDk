class Main {
  public static void main(String[] args) {
    // Call your methods here

    pattern01();
    pattern02();
    pattern03();
    pattern02();
    pattern01();
    
  }

  public static void pattern01(){

    System.out.println("   "+ '/'+'\\'   + "       " +  '/'+'\\');   
    System.out.println("  "+ '/'+"  "+'\\' + "     " +    '/' +"  " +'\\' );
    System.out.println(" "+ '/' + "    "+    '\\'  +"   "+ '/' + "    " + '\\');
    
  }

  public static void pattern02(){

    System.out.println(""+"+------+"+" "+ "+------+");
    System.out.println(""+"|      | |      |");
    System.out.println(""+"|      | |      |");
    System.out.println(""+"+------+"+" "+ "+------+");
  }

  public static void pattern03(){

    System.out.println("|United| |United|");
    System.out.println("|States| |States|");

    
  }


  // create your methods here
}