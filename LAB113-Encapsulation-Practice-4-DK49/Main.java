class Main extends Elevator{
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Elevator obj = new Elevator (7);

    obj.setcurrentFloor(2);
    System.out.println(obj.getcurrentFloor());
    obj.setdoorOpen(false);
   System.out.println( obj.getdoorOpen());

    obj.goUp(6);
    System.out.println(obj.getcurrentFloor());
    }
     
}


    class Elevator{
       public Elevator(){}
     private int currentFloor = 1;
     private int numberOfFloors = 1;
     private boolean doorOpen = false;

     public Elevator(int numberOfFloors){
       this.numberOfFloors = numberOfFloors;
     }

      public int getcurrentFloor(){
        return currentFloor;
      }

      public int getnumberOfFloors(){
        return numberOfFloors;
      }

    public boolean getdoorOpen(){
      return doorOpen;
    }

     public void setcurrentFloor(int currentFloor){
       this.currentFloor = currentFloor;
     }

     public void setnumberOfFloors(int numberOfFloors){
       this.numberOfFloors = numberOfFloors;
     }

     public void setdoorOpen(boolean doorOpen){
       this.doorOpen = doorOpen;
     }


     public void OpenDoor(){
       doorOpen = true;
     }

     public void closeDoor(){
       doorOpen = false;
     }

      public void goUp(int DesiredFloor){
        if((doorOpen == false) & (DesiredFloor+currentFloor <= numberOfFloors))
          currentFloor += DesiredFloor; 
      }

     public void goDown(int DesiredFloor){
       if((doorOpen == false) & (DesiredFloor-currentFloor > 0))
          currentFloor -= DesiredFloor;
     }

     


     
     
   }
