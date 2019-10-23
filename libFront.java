import java.util.Scanner;

/**
 * main class to test Library functions
 */
public class libFront {


     public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        Library newLib = new Library();
        int input;

        Book b1 = new Book("How to eat pants");
        newLib.addBook(b1);
        //newLib.checkOut(b1);

        Book b2 = new Book("Give me some stuff", "Robert Benis");
        newLib.addBook(b2);
        // System.out.println(b2.getTitle());
        // System.out.println(b2.getAuthor());
        // System.out.println(b2.getID());

        //newLib.checkIn(b1);
        
        Boolean done = false;


        System.out.println("WELCOME TO THE LIBRARY SYSTEM. ENTER A NUMBER TO DO A THING");
        System.out.println("===========================================================");
        while (!done){

            int bookid;
            int result;

            System.out.println("0.) Exit");
            System.out.println("1.) Check out a book");
            System.out.println("2.) Check in a book");
            System.out.println("3.) What books are in the library?");
            input = s.nextInt();

            switch (input){
                case 0:
                    done = true;
                    break;
                case 1:

                    newLib.displayBooks();
                    System.out.println("Enter the ID of the book you want to check out:");
                    bookid = s.nextInt();
                    result = newLib.checkOut(bookid);

                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    switch (result){
                        case -1:
                            System.out.println("THAT ID DOES NOT EXIST");
                            break;
                        case 0:
                            break;
                        case 1:
                            System.out.println("CHECK OUT SUCCESSFUL. REMEMBER TO RETURN IT");
                            break;

                    }
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
                case 2:
                    newLib.displayBooks();
                    System.out.println("Enter the ID of the book you want to check in:");
                    bookid = s.nextInt();
                    result = newLib.checkOut(bookid);
                    
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    switch (result){
                        case -1:
                            System.out.println("THAT ID DOES NOT EXIST");
                            break;
                        case 0:
                            break;
                        case 1:
                            System.out.println("CHECK IN SUCCESSFUL. THANKS FOR RETURNING IT");
                            break;

                    }
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
                case 3:
                    newLib.displayBooks();
                    break;
                default:
                    System.out.println("I'm sorry, please enter a valid option");

                    
            }

            System.out.println("===========================================================");

        }

        s.close();
    }
}