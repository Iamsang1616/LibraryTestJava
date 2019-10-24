/**
 * Main library implementation
 */

import java.util.*;

public class Library {
    public static int id = 0;
    
    public void addBook(Book b){
        library_books.put(b.getID(), b);
    }


    public int checkOut(int id){

        Book b = library_books.get(id);
        if (b == null){
            return -1;
        }
        if (b.isCheckedOut()){

            return 0;
        }
        else{
            b.changeCheckStatus();
            return 1;
        }
    }

    public int checkIn(int id){
        Book b = library_books.get(id);
        if (b == null){
            System.out.println("That book is not in this library");
            return -1;
        }
        else{
            //If book was checked out, check it back in
            if (b.isCheckedOut()){
                //System.out.println("Thank you for returning the book");
                b.changeCheckStatus();
                return 1;
            }
            //If book wasn't checked out in the first place, it can't be checked in
            else{
                //System.out.println("This book has not been checked out yet");
                return 0;
            }
        }
    }

    public void displayBooks(){
        System.out.println("========================================");
        library_books.entrySet().forEach(entry->{
            Book b = entry.getValue();
            System.out.println("ID: " + b.getID() + " | " + b.getTitle() + " by " + b.getAuthor());
        });
    }

    public String getBookTitle(int id){
        return library_books.get(id).getTitle();
    }
   

    //vector representing all the books in the library?
    //private Vector<Book> library_books = new Vector<Book>();
    private Map<Integer, Book> library_books = new HashMap<Integer, Book>();
}
