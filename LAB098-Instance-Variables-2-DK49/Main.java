class Main {
  public static void main(String[] args) {
    // Test your class by creating objects and accessing its instance variables

    Clock obj0 = new Clock();
    Clock obj1 = new Clock();
    Clock obj2 = new Clock();

     System.out.println("Object 1 : " + obj0.hours + " ," + obj0.isTicking + " ," +obj0.diff);
     System.out.println();
     System.out.println("Object 2 : " + obj1.hours + " ," + obj1.isTicking + " ," +obj1.diff);
     System.out.println();
     System.out.println("Object 3 : " + obj2.hours + " ," + obj2.isTicking + " ," +obj2.diff);
     System.out.println();

    
  }
}