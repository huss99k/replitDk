Create and implement a class named GasTank containing:

An instance variable named amount of type double, initialized to 0.

A method named addGas that accepts a parameter of type double. The value of the amount instance variable is increased by the value of the parameter.

A method named useGas that accepts a parameter of type double. The value of the amount instance variable is decreased by the value of the parameter. However, if the value of amount is decreased below 0, amount is set to 0.

A method named isEmpty that accepts no parameters. isEmpty returns a boolean value: true if the value of amount is less than 0.1, and false otherwise.

A method named getGasLevel that accepts no parameters. getGasLevel returns the value of the amount instance variable.