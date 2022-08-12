 class ShoppingCart{

   private int  totalNumberOfItems;
   private double totalAmountOwed;


    public ShoppingCart(){}

       public void setTotalNumberOfItems(int totalNumberOfItems){
       this.totalNumberOfItems = totalNumberOfItems;
   }

   public int getTotalNumberOfItems(){
     return totalNumberOfItems;
   }

    public void setTotalAmountOwed(double totalAmountOwed){
      this.totalAmountOwed = totalAmountOwed;
  }

    public double getTotalAmountOwed(){
      return totalAmountOwed;
    }


   public double getAveragePricePerItem(){
     double result = 0;
     result = totalAmountOwed/totalNumberOfItems;
     return result;
   }

   public void addItems(int numberOfItems, double pricePerItem){

     totalNumberOfItems += numberOfItems;
     totalAmountOwed = pricePerItem * numberOfItems;   
   }

   public void empty(){
     totalAmountOwed = 0.0;
     totalNumberOfItems = 0;
   }

   
















  
}