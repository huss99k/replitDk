Create a method that generates a random license plate for 3 states in the DMV area (DC,MD,VA). 
Your method takes the state name and returns the corresponding random license plate.
The format of the license plates for each state is as follows:
  VA -> XXX-####  (e.g UUW-6698)
  DC -> XX#### (e.g BA1956)
  MD -> #XX#### (e.g 5CE2273)

If the invalid state is passed as an argument, your method should return an empty string.
(Additionally, you can also implement the generation of your own state's license plate).

   Examples:
    
    generatePlate("VA") -> "ADS-2252"
    generatePlate("MD") -> "3BS6121"
    generatePlate("DC") -> "NS7821"
    generatePlate("NY") -> ""
    generatePlate("TX") -> ""
    generatePlate("blalala") -> ""
