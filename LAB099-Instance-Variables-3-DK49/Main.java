class Main {
  public static void main(String[] args) {

    Clock dk = new Clock();

     dk.hours += 24;
     dk.diff++;
     System.out.println(dk.diff + ","+ dk.hours);
     System.out.println(dk.isTicking);
  }
}