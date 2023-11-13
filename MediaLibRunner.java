/*
 * Activity 2.5.7
 * 
 * Modified By: Thaman Suggala & Manning Wu
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner {
  public static void main(String[] args) {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    /* Added With 2.5.7 */
    // System.out.println("Library:\n" + myLib); //testing

    // new Book constructor
    Book myBook = new Book("The Lord of the Rings", "Tolkien");

    // Prints out statement with title and author since the toString() method in
    // Book is invoked
    System.out.println("Book created " + myBook);

    // adding myBook instance to myLib instance
    myLib.addBook(myBook);

    /*
     * //Debugging Testers - added with 2.5.7
     * 
     * // System.out.println("Library:\n" + myLib); //testing
     * 
     * int myRating = 5;
     * myBook.adjustRating(myRating);
     * System.out.println(myBook); // testing
     * 
     * // myBook.adjustRating(2); //testing if mutator changes the value of myRating
     * if
     * // different value is passed
     * System.out.println(myRating); // testing if myRating changes after mutator
     * call
     * 
     * // #13
     * myBook.setTitle("Thaman's Story");
     * System.out.println("Book:" + myBook); // testing
     * System.out.println("Library: " + myLib); // testing
     *** 
     * Activity 2.5.7 PROVIDED ***
     * System.out.println("You have a NEW Library");
     * MediaLib myLib2 = new MediaLib();
     * 
     * Book newBook = new Book("To Kill a Mockingbird", "Lee");
     * myLib2.addBook(newBook);
     * System.out.println(myLib2);
     * newBook = new Book("1984", "Orwell");
     * System.out.println(myLib2);
     * 
     * // #20
     * System.out.println("before test:" + newBook);
     * myLib.testBook(newBook);
     * System.out.println("after test:" + newBook);
     * 
     * Book newBook2 = new Book("1984", "Orwell");
     * System.out.println(newBook.equals(newBook2));
     */

    // 30-32
    Movie movie = new Movie("The Lord of the Rings", 1.75);
    myLib.addMovie(movie);

    System.out.println(myLib);

  }
}
