import java.util.ArrayList;

class Main{

  public static void main(String[] args){

    ArrayList<String> list = new ArrayList<>();
    list.add("hello");
    list.add("hola");
    list.add("hallo");
    list.add("que paso");
    list.add("como");

    test(list);  

    System.out.println(list); //[duo, hola, hallo, que paso, tech]

    ArrayList<String> list2 = new ArrayList<>();
    list2.add("hello");
    list2.add("como");

    test(list2);  

    System.out.println(list2); //[duo,tech]
    
   
  }



	public static void test(ArrayList<String> words){

    int last = words.size()-1;
    if(words.size() >= 1){
    
     //  words = (words.size()-1).remove();
         words.set(0,"duo");
         words.set(last,"tech");

       }
		    
		// implement here
	}
}