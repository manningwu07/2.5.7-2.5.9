public class Book {
  private int rating;
  private String title;
  private String author;

  /*** Constructor ****/
  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getRating() {
    return rating;
  }

  public boolean equals(Book b) {
    if (this.title.equals(b.title) && this.author.equals(b.author))
      return true;

    return false;
  }

  public String toString() {
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0)
      info += ", rating is " + rating;

    return info;
  }

  /*** Mutator methods ***/
  public void setAuthor(String a) {
    // String author = "";
    author = a;
  }

  public void setTitle(String t) {
    // String title = "";
    title = t;
  }

  public void adjustRating(int r) {
    int rating = this.rating;

    if ((rating + r >= 0) && (rating + r <= 10))
      this.rating += r;
  }

}