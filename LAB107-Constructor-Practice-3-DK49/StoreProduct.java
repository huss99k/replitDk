
 public class StoreProduct{

   String label;
   int price;
   String category;
   boolean hasExpiration;
   int stock;


   public StoreProduct(){}

   public StoreProduct(String label,int price,int stock){    
     this.stock = stock;
     this.label = label;
     this.price = price;
     this.category = "misc";
     this.hasExpiration = false;
    
   }

    public StoreProduct(String label,int price){
      this.stock =0;
      this.label = label;
      this.price = price;
     
    }

    public StoreProduct(String label,int price,String category,boolean hasExpiration){
      this.label = label;
      this.price = price;
      this.category = category;
      this.hasExpiration = hasExpiration;
    }

    public void expired(boolean hasExpired){

      if(hasExpired == true)
         stock = 0;
    }

    public boolean sell(int quantity){
       boolean result = false;
       if(stock >= quantity)
         result = true;

      return result;
    }

    public double getDiscountedPrice(double discount){
       double result = 0.0;
      price = (int)(price / (10 * discount));
      result += price;
      
      return result;
    }
   
 }