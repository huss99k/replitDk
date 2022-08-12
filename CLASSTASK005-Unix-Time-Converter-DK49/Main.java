class Main {
  public static void main(String[] args) {
         
  //  System.out.println(System.currentTimeMillis());

   long milliseconds = System.currentTimeMillis();

   // Use the above variable to extract days, hours, mins, and seconds and print them out
   // Example Output:
    //   18796 days, 22 hours, 29 mins, 27 seconds have passed since UNIX time

    long days = (milliseconds / 86400000);
    long input = (milliseconds % 86400000 );

    long hours = (input / 3600000);
     input = (input % 3600000);

    long minutes = (input / 60000 );
     input = (input % 60000 );

    long seconds = (input / 1000 );
      input = (input % 1000);

      System.out.println("Days : " + days + " Hours : " + hours + " Minutes : " + minutes + " Seconds : " + seconds);





  

     

    // Pseudocode
     // 1.  Extract the full days out of the given milliseconds ( use  / )
        // 1 day =  86400000 ms

     // 2.  Extract the remaining milliseconds ( use % )
         
     // 3.  From the remaining milliseconds, extract the full amount of hours ( /)
        //   1 hr =3600000ms


     // 4. Extract the remaining milliseconds ( use % )

     // 5. From the remaining milliseconds, extract the full amount of minutes ( /)
           // 1 min = 60000ms
     // 4. Extract the remaining milliseconds ( use % )

     // 5. From the remaining milliseconds, extract the full amount of seconds ( /)
            // 1 sec = 1000ms

     
  }
}