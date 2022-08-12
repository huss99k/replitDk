public class Product implements Comparable<Product>{

 private String name = "";
  private int price = 0;
  private int quantity = 0;
 private  String fabricType = "";

   public String getname(){
     return name;
   }

  public String getfabricType(){
    return fabricType;
  }

  public int getprice(){
    return price;
  }

  public int getquantity(){
    return quantity;
  }

  public void setname(String name){
     this.name = name;    
  }

   public void setfabricType(String fabricType){
     this.fabricType= fabricType;    
  }

   public void setprice(int price){
     this.price = price;    
  }

  public void setquantity(int quantity){
       this.quantity = quantity;
  }


    public Product(String name,String fabricType,int price,int quantity){
      this.name = name;
      this.quantity = quantity;
      this.fabricType = fabricType;
      this.price = price;
    }

   public String toString(){
     return "Name is: "+ name
       + "\n"+" FabricType is: "
       +fabricType+"\n" 
       + "Price is: " + price 
       + "\n" + "Quantity is: " + quantity;
  }

  
  @Override
   public int compareTo(Product o){
        return this.name.compareTo(o.name); 
   }

   






  
}