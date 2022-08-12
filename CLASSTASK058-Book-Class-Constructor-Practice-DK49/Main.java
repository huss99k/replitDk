class Main {
  public static void main(String[] args) {
    // Create 4 Book objects using 4 different constructors

    Book obj0 = new Book();
    Book obj1 = new Book("Harrypotter","jk Rowling");
    Book obj2 = new Book("Harrypotter","Jk ROWLING","Dk","Horror");
    Book obj3 = new Book("Harrypotter","Jk ROWLING","Dk","Horror","1UXZ387",488,true);
    

     obj1.setAuthor("Ali");
     obj1.setPublisher("Mr G");

    System.out.println(obj1.author + " , " + obj1.publisher);
  }
}