class Main {
  public static void main(String[] args) {


     ShoppingCart obj =  new ShoppingCart();


    obj.setTotalAmountOwed(766.89);
    obj.setTotalNumberOfItems(18);

    System.out.println(obj.getTotalAmountOwed());
    System.out.println(obj.getTotalNumberOfItems());
    // methods of classes 


    System.out.println( obj.getAveragePricePerItem());
    obj.addItems(90,377.7);
    System.out.println( obj.getAveragePricePerItem());
  }
}