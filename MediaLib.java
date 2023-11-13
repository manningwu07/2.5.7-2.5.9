/**
 * Activity 2.5.7
 * 
 * Modified By: Thaman Suggala & Manning Wu
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib {
  /*
   * // used Book constructor in order to by pass nullPointerError
   * // private Book book = new Book("", "");
   * private Book book;
   * private Movie movie;
   * private Song song;
   * 
   * public void addBook(Book b) {
   * book = b;
   * // added with 2.5.8
   * if (numEntries < 3) {
   * numEntries++;
   * }
   * }
   * 
   * public void addMovie(Movie m) {
   * movie = m;
   * // added with 2.5.8
   * if (numEntries < 3) {
   * numEntries++;
   * }
   * }
   * 
   * // added with 2.5.8
   * public void addSong(Song s) {
   * song = s;
   * if (numEntries < 3) {
   * numEntries++;
   * }
   * }
   * 
   * public String toString() {
   * String info = "Library:";
   * info += "\n\"" + book.getTitle() + "\", written by " + book.getAuthor();
   * info += "\n\"" + movie.getTitle() + "\", is " + movie.getDuration() +
   * " long";
   * info += "\n\"" + song.getTitle() + "\"";
   * 
   * return info;
   * }
   * 
   * /*
   * public void testBook(Book tester)
   * {
   * tester.setTitle("Animal Farm");
   * // show state change with one of the following
   * System.out.println(" in test: " + tester);
   * System.out.println(" in test: " + tester.getTitle());
   * }
   * 
   * Activity 2.5.8
   * 
   * Modified By: Thaman Suggala & Manning Wu
   * 
   * /*
   * // Step 9
   * // private static String owner = "Thaman S. & Manning W.";
   * public static String owner = "Thaman S. & Manning W.";
   * private static int numEntries = 0;
   * 
   * // Steps 1-3
   * public static String getOwner() {
   * return owner;
   * }
   * 
   * // Steps 7-8
   * public static void changeOwner(String ownerValue) {
   * owner = ownerValue;
   * }
   * 
   * // Steps 12-15
   * public static int getNumEntries() {
   * // Step 18-20
   * // System.out.println("Test: Owner is " + owner);
   * // System.out.println("Test: Book is " + (String)book); //ERROR: Cannot make
   * a
   * // static reference to the non-static field movie
   * // System.out.println("Test: Movie is " + (String)movie); //ERROR: Cannot
   * make a
   * // static reference to the non-static field movie
   * // System.out.println("Test: MediaLib is " + this.book); //ERROR: Cannot use
   * // this in a static context
   * 
   * return numEntries;
   * }
   * 
   */

  /*
   * Activity 2.5.9
   * Developed By: Thaman Suggala
   */

  public static String owner = "PLTW";

  private static int numEntries;
  private static int numBooks;
  private static int numMovies;
  private static int numSongs;

  private Book book;
  private Movie movie;
  private Song song;
  private String date;

  public MediaLib() {
    book = null;
    movie = null;
    song = null;
    date = Calander.getDateTime();
  }

  public MediaLib(Book b, Movie m, Song s, String d) {
    book = b;
    movie = m;
    song = s;
    date = Calander.getDateTime();
  }

  public void addBook(Book b) {
    if (book == null) {
      book = b;
      numEntries++;
      numBooks++;

      date = Calander.getDateTime();
    } else
      System.out.println("Cannot add a new book: A book already exists");
  }

  public void addMovie(Movie m) {
    if (movie == null) {
      movie = m;
      numEntries++;
      numMovies++;

      date = Calander.getDateTime();
    } else
      System.out.println("Cannot add a new movie: A movie already exists");
  }

  public void addSong(Song s) {
    if (song == null) {
      song = s;
      numEntries++;
      numSongs++;

      Calander.getDateTime();
    } else
      System.out.println("Cannot add a new song: A song already exists");
  }

  public static String getOwner() {
    return owner;
  }

  public static void changeOwner(String o) {
    owner = o;
  }

  public static int getNumEntries() {
    return numEntries;
  }

  public static int getNumBooks() {
    return numBooks;
  }

  public static int getNumMovies() {
    return numMovies;
  }

  public static int getNumSongs() {
    return numSongs;
  }

  public String toString() {
    String info = "";
    // public String info = ""; //illegal start of expression

    if (book != null)
      info += "Book: " + book + "\n";
    if (movie != null)
      info += "Movie: " + movie + "\n";
    if (song != null)
      info += "Song: " + song + "\n";

    info += "Date: " + date + "\n";

    return info;
  }

  /*
   * info can not be accessed due to incorrect scope
   * public String getInfo()
   * {
   * return "The current book information is " + info;
   * }
   */
}
