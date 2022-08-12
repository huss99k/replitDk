class Main {
  public static void main(String[] args) {

    // tests
    System.out.println(withoutEnd("Hello")); // → "ell"
    System.out.println(withoutEnd("java")); // → "av"
    System.out.println(withoutEnd("coding")); // → "odin"
    System.out.println(withoutEnd("woohoo")); // → "ooho"
    System.out.println(withoutEnd("ab") ); //→ ""
  }


  public static String withoutEnd(String str) {

    String result = "";

    result = str.substring(1,str.length()-1);
  

  return result;
}
}