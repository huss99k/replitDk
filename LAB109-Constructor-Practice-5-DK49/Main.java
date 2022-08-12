class Main {
  public static void main(String[] args) {
    
    //Test your class constructor, instance variable and methods

    ParkingMeter object01 = new ParkingMeter(90);
    System.out.println(object01.add(25));
    object01.tick();
    System.out.println(object01.isExpired());
    System.out.println(object01.timeLeft);
     
  }
}