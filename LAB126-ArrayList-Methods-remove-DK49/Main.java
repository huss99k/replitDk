import java.util.*;


class Main{

  public static void main (String [] args){
       //TESTS
    ArrayList<Double> list1 = new ArrayList<>();
    list1.add(1.2);
    list1.add(3.2);
    list1.add(5.5);
    list1.add(6.6);
    list1.add(6.7);
  
    remove(list1); 

    System.out.println(list1); // [6.7]

    
    ArrayList<Double> list2 = new ArrayList<>();
    list2.add(99.0);
    list2.add(23.2);
    list2.add(12.3);
    list2.add(34.2);
    list2.add(99.0);
    list2.add(23.2);
    list2.add(12.3);
    list2.add(34.2);
    list2.add(12.5);
  
    remove(list2); 

    System.out.println(list2); // [12.5]


    ArrayList<Double> list3 = new ArrayList<>();
    list3.add(99.0);
    list3.add(1.0);
  
    remove(list3); 

    System.out.println(list3); // [1.0]


  }



	public static void remove(ArrayList<Double> dubs){        
       // implementation

       // int length = dubs.size(); 
         //  length -= 1;

     Double last = dubs.get(dubs.size()-1);

    // for(int i = 0; i < dubs.size(); i++){
    //         dubs.remove(i);  
    // }

        // dubs.removeAll(dubs);
        //  dubs.add(0,last);

     while (dubs.size() > 1){
      dubs.remove(0);
      }


   
       
	}
}