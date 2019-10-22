/**
 * class to represent books in the library
 */


public class Book {
    //book constructed with title and author
    Book(String t, String a){
        this.title = t;
        this.author = a;
        checked_out = false;
        id = Library.id++;
    }

    //book with just an author
    Book(String t){
        this.title = t;
        this.author = "Anonymous";
        checked_out = false;
        id = Library.id++;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public Boolean isCheckedOut(){
        return checked_out;
    }
    public int getID(){
        return id;
    }



    public void changeCheckStatus(){
        checked_out = !checked_out;
    }

    private String title;
    private String author;
    private int id;
    private Boolean checked_out;
    
}