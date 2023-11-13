/*
 * Activity 2.5.7
 * 
 * Modified By: Thaman Suggala & Manning Wu
 * A Movie class for the MediaLibrary program
 */
public class Movie {
  private String title;
  private double duration;
  private int rating;

  /*** Constructor ****/
  public Movie(String t, double d) {
    title = t;
    duration = d;
    rating = 0;
  }

  /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getDuration() {
    return duration + " hours";
  }

  public int getRating() {
    return rating;
  }

  public String toString() {
    String info = "\"" + title + "\", is " + duration + " long";
    if (rating != 0) {
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(double d) {
    duration = d;
  }

  public int adjustRating(int r) {
    if (r < 0 || r > 10) {
      return 0;
    }
    rating += r;
    return rating;
  }

  public boolean equals(Movie m) {
    if (m.title.equals(this.title) && m.getDuration().equals(this.getDuration())) {
      return true;
    }
    return false;
  }
}