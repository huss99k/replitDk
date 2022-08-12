  class Main {
  public static void main(String[] args) {
    //TESTS
    System.out.println(convertToRoman(1)); // I
    System.out.println(convertToRoman(5)); // V
    System.out.println(convertToRoman(10)); // X
    System.out.println(convertToRoman(7)); // VII
    System.out.println(convertToRoman(3)); // III
    System.out.println(convertToRoman(0)); // Invalid  
    System.out.println(convertToRoman(-2)); // Invalid 
    System.out.println(convertToRoman(123)); // Invalid   

  }


  public static String convertToRoman(int num){

        String convertnum = "";

     switch (num){

       case 1: convertnum = "I";
           break;
       case 2: convertnum = "II";
           break;
       case 3: convertnum = "III";
          break;
       case 4: convertnum = "IV";
          break;
         case 5: convertnum = "V";
          break;
         case 6: convertnum = "VI";
          break;
         case 7: convertnum = "VII";
          break;
         case 8: convertnum = "VIII";
          break;
         case 9: convertnum = "IX";
          break;
         case 10: convertnum = "X";
          break;
         default : convertnum = "Invalid";
          break;
     }

       return convertnum;
    

  }
}