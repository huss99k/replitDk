class Main {
  public static void main(String[] args) {

    System.out.println(sumofeven(1,100));
  }

  public static int sumofeven(int a,int b){

    int total= 0;
    for(int i = a;i<= b; i++ ){
        if(i%2==0){
          total = total + i;
                    System.out.println("loop" + i + " " + total);

        }
          
    }
  
    return total;
  }
  
}