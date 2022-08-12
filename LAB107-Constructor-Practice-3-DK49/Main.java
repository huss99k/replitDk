
class Main{
	public static void main(String[] args){

     StoreProduct obj = new StoreProduct();
     StoreProduct oats = new StoreProduct("SuperOats",3);
     StoreProduct bread = new StoreProduct("BrownOrganic",3,57);
     StoreProduct milk = new StoreProduct("Fairlife",4,"Skim Milk",true);

    
      System.out.println(bread.sell(40));
      bread.expired(true);
      System.out.println(bread.stock);
     System.out.println(bread.getDiscountedPrice(.01));

    
    
	}
}