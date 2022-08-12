
 public class Stock{

   String symbol;
   String name;
   double previousClosingPrice;
   double currentPrice;


   public Stock(String symbol,String name){
       this.symbol = symbol;
       this.name = name;
   }

    public Stock(String symbol,String name,double previousClosingPrice,double currentPrice){

      this.symbol = symbol;
      this.name = name;
      this.currentPrice = currentPrice;
      this.previousClosingPrice = previousClosingPrice;
      
    }

    public Stock(){
      symbol = "GOOG";
      name = "Google Inc";
      
    }


    public double getChangePercent(){

      double result = 0;

      result = ((currentPrice - previousClosingPrice)/previousClosingPrice) * 100;

      return result;
    
    }


    public void setSymbol(String symbol){

       this.symbol = symbol;
      System.out.println(symbol);
    }

   public void setName(String name){
     this.name = name;
     System.out.println(name);
   }


   
 }