Create a well-encapsulated class Elevator.

It should contain the following:

Data fields:

currentFloor - The current floor that the elevator is on.
numberOfFloors - The number of floors available to the elevator.
doorOpen - Whether the elevator door is open or not.

Constructor that initializes numberOfFloors. New elevators start on floor 1.

Methods:

Getters for all data fields.

openDoor() - opens the elevator door.
closeDoor() - closes the elevator door.
goUp(int desiredFloor) -sends the elevator upward to the desired floor as long as the door is not open. Cannot go past last floor.
goDown(int desiredFloor) - sends the elevator downward to the desired floor as long as the door is not open. Cannot go past floor 1.


Create one object of the class in the main method and call getters and other methods to test your class.


