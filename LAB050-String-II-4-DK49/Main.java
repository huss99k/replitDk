class Main {
  public static void main(String[] args) {
    //tests
    System.out.println(middleThree("Candy")); // → "and"
    System.out.println(middleThree("and") ); //→ "and"
    System.out.println(middleThree("solving")); // → "lvi"
    System.out.println(middleThree("Chocolate")); // → "col"
    System.out.println(middleThree("java yet java")); // → "yet"

  }

  public static String middleThree(String str) {

    String result = "";

    result = str.substring(str.length()/2-1,str.length()/2+2);

  return result;
}
}