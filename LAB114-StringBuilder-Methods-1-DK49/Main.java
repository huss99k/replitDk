class Main {
  public static void main(String[] args) {
    
     StringBuilder sb = new StringBuilder("Talk is cheap.");

    // Create a StringBuilder object sb with value "Talk is cheap."


    // Modify sb to display "Talk is cheap. Show me the code."
       sb.append(" Show me the code.");
    
    //Modify sb to display "Empty talk is cheap. Show me the code."
      sb.insert(0,"Empty ").replace(6,7,"t");
     System.out.println(sb);

    //Modify sb to display "Empty talk is useless. Show me the code."
     sb.replace(14,19,"useless");
    System.out.println(sb);

    //Modify sb to display "Empty talk is useless and no good. Show me the code."
     sb.insert(21," and no good");
     System.out.println(sb);

    //Modify sb to display "Empty talk is no good. Show the code."
     sb.delete(13,25);
     System.out.println(sb);

    //Modify sb to display "Talk less. Code more."
    sb.replace(6,7,"T").delete(10,sb.length()-1).delete(0,6).append(" less. Code more.").delete(4,5);
     System.out.println(sb);

    //Modify sb to display ".erom edoC .ssel klaT"
      sb.reverse();
      System.out.println(sb);

    



  }
}