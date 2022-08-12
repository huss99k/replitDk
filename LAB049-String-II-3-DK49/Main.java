class Main {
  public static void main(String[] args) {
    //tests
    System.out.println(noStart("Hello", "There")); // → "ellohere"
    System.out.println(noStart("java", "code"));  // → "avaode"
    System.out.println(noStart("shotl", "java")); // → "hotlava"
     System.out.println(noStart("x", "ac")); // → "c"
    System.out.println(noStart("a", "x")); // → ""
  }

  public static String noStart(String a, String b) {

    String result = "";

    result = a.substring(1).concat(b.substring(1));

  return result;
}
}