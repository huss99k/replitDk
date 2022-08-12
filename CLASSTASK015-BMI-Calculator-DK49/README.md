 Write a method that takes weight in kgs and height in meters and returns the following String based on the 
 value of the BMI:

 BMI < 18.5         -> underweight
 18.5 <= BMI < 25.0 -> normal
 25.0 <= BMI < 30.0 -> overweight
 BMI >= 30.0        -> obese

Formula for calculating the BMI:
BMI = weight / (height * height) 



    /*
       Examples: 
        getBMIMessage(90, 1.8)  -> overweight
        getBMIMessage(70, 1.72) -> normal
        getBMIMessage(55, 1.8)  -> underweight
        getBMIMessage(100, 1.78)-> obese
    */