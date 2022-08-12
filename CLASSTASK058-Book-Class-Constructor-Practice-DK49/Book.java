
 public class Book{

   String title;
   String author;
   String isbn;
   int pages;
   String publisher;
   boolean isHardCover;
   String genre;


    public Book(){
    }

     public Book(String title,String  author){

       this.title = title;
       this.author = author;
     }


   public Book(String title,String author,String publisher,String genre){

     this.title = title;
     this.author = author;
     this.publisher = publisher;
     this.genre = genre;
   }


     public Book(String title,String author,String publisher,String genre,String isbn,int pages,boolean isHardcover){

       this.title = title;
       this.author = author;
       this.publisher = publisher;
       this.genre = genre;
       this.pages = pages;
       this.isHardCover = isHardcover;
       this.isbn = isbn;
   }

   public void setAuthor(String author){
     this.author = author;
   }

   public void setPublisher(String publisher){
     this.publisher = publisher;
  }
   
   
 }