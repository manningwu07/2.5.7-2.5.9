/*
 * Activity 2.5.9
 */
public class MediaLibRunnerScope {
    public static void main(String[] args) {

        /*
         * MediaLib myLib = new MediaLib();
         * myLib.addMovie(new Movie("Raiders of the Lost Ark", 1.9));
         * myLib.addBook(new Book("1984", "Orwell"));
         * myLib.addSong(new Song("In Your Eyes"));
         * System.out.println(MediaLib.getOwner() + "'s Library:\n" + myLib);
         */

        Book book = new Book("The Lord of the Rings", "Tolkien");
        System.out.println(book);
        book.adjustRating(4);
        System.out.println("new rating: " + book.getRating());
        book.adjustRating(5);
        System.out.println("new rating: " + book.getRating());
    }
}