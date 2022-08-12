import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		ArrayList<Boolean> list = new ArrayList<>();
    list.add(true);
    list.add(false);
    list.add(true);
   
    duplicate(list);

   System.out.println(list); // [true,false,true,true,false,true]

	}
	

  public static void duplicate(ArrayList<Boolean> bools) {

        int length = bools.size();
        ArrayList<Boolean> temp = new ArrayList<>();
    
         for(int i = 0; i < bools.size();i++){
               temp.add(bools.get(i));
         }

                  bools.addAll(temp); 
            
              
            // temp.add(bools.get(0));
            // bools.add(temp.get(0));
                
         
    //  bools.add(bools.size(),temp);
  }
	
}