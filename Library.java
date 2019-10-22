/**
 * Main library implementation
 */

import java.util.*;

public class Library {
    public static int id = 0;
    
    public void addBook(Book b){
        library_books.put(b.getID(), b);
    }


    public void checkOut(Book b){
        if (b.isCheckedOut()){
            System.out.println(b.getTitle() + " HAS ALREADY BEEN CHECKED OUT");
            return;
        }
        else{
            b.changeCheckStatus();
            System.out.println("CHECK OUT SUCCESSFUL. REMEMBER TO RETURN IT");
            return;
        }
    }

    public void checkIn(Book b){
        if (library_books.get(b.getID()) == null){
            System.out.println("That book is not in this library");
        }
        else{
            //If book was checked out, check it back in
            if (b.isCheckedOut()){
                System.out.println("Thank you for returning the book");
                b.changeCheckStatus();
            }
            //If bookt wasn't checked out in the first place, it can't be checked in
            else{
                System.out.println("This book has not been checked out yet");
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

   

    //vector representing all the books in the library?
    //private Vector<Book> library_books = new Vector<Book>();
    private Map<Integer, Book> library_books = new HashMap<Integer, Book>();
}
