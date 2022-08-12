class Main {
  public static void main(String[] args) {
    // Test your method here

      ParkingMeter obj = new ParkingMeter();

         System.out.println(obj.add(25));
         obj.tick();
         System.out.println(obj.isExpired());
         System.out.println(obj.value());
  }
}