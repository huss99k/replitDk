import java.util.*;

class Main {
  public static void main(String[] args) {

    System.out.println(removeNonAlphaNumeric("https://www.duotech.io/"));

  }

  public static String removeNonAlphaNumeric(String str) {
    // implement
      String temp = "";

    // char [][] sv = {{','},{'.'},{'/'},{'|'}, {'!'}, {'@'}, {'#'}, {'&'}, {'('},
    // {')'}, {'–'}, {'['}, {'{'}, {'}'},{']'}, {':'} ,{';'}, {'?'}, {'/'}, {'*'}};

    String sv = "!@#&()–[{}]:;',?/*`~$^+=<>";

    StringBuilder sb = new StringBuilder(str);
    String result = "";
    if (str.length() < 1) {
      System.out.println("Please Enter A Text");
    }

    for (int i = 0; i < sb.length(); i++) {
      for (int j = 0; j < sb.length(); j++) {
        if (str.charAt(i) == sv.charAt(j)) {
          sb = sb.deleteCharAt(i);
          temp = Character.toString(str.charAt(i));
        }
      }
    }
           result = temp;
    return result;
  }

}