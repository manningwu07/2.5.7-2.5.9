/*
 * Activity 2.5.8
 * 
 * Developed By: Thaman Suggala & Manning Wu
 * A Static Media Library Runner for the MediaLibrary program
 */

public class MediaLibRunnerStatic {
    public static void main(String[] args) {
        // Step 1
        System.out.println(MediaLib.getOwner() + "'s Library");

        // MediaLib.changeOwner("PLTW"); //editing the owner value with static method

        // Step 10
        MediaLib.owner = "PLTW"; // same thing as line 13 with owner being public
        System.out.println(MediaLib.getOwner() + "'s Library");

        // Step 14
        System.out.println(MediaLib.getNumEntries());

        // new objects:
        MediaLib myLib = new MediaLib();

        Movie movie = new Movie("The Lord of the Rings", 1.75);
        myLib.addMovie(movie);

        Book myBook = new Book("The Lord of the Rings", "Tolkien");
        myLib.addBook(myBook);

        // Step 17
        System.out.println(MediaLib.getNumEntries());

        // Step 22
        Movie movie2 = new Movie("Thaman's Story", 0.25);
        myLib.addMovie(movie2);

        System.out.println(myLib);

        System.out.println(MediaLib.getNumEntries());
    }
}
