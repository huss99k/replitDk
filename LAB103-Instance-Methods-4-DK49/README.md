Create and implement a class named ParkingMeter containing:

An instance variable named timeLeft of type int, initialized to 0.

A method named add that accepts an integer parameter. If the value of the parameter is equal to 25, the value of timeLeft is increased by 30; otherwise no increase is performed. add returns a boolean value: true if timeLeft was increased, false otherwise.

A method named tick that accepts no parameters and returns no value. tick decreases the value of timeLeft by 1, but only if the value of timeLeft is greater than 0.

A method named isExpired that accepts no parameters. isExpired returns a boolean value: true if the value of timeLeft is equal to 0; false otherwise.