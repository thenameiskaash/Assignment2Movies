class Movie {

  // First we declare the variables
  private String title;
  private int year;
  private String director;
  private int duration;
  private String actors;
  private String genre;
  private int rating;

  // Declaring a Constructor
  public Movie(String title, int year, String director, int duration, String actors, String genre, int rating) {
    this.title = title;
    this.year = year;
    this.director = director;
    this.duration = duration;
    this.actors = actors;
    this.genre = genre;
    this.rating = rating;
  }

  // Declaring getter functions

  public String getTitle() {
    return this.title;
  }

  public int getYear() {
    return this.year;
  }

  public String getDirector() {
    return this.director;
  }

  public int getDuration() {
    return this.duration;
  }

  public String getActors() {
    return this.actors;
  }

  public String getGenre() {
    return this.genre;
  }

  public int getRating() {
    return this.rating;
  }

  public void print() {
    System.out.print("Title : " + title + " | Year : " + year + " | Directors : " + director + " | Duration : "
        + duration + " | Actors : " + actors + " | Rating : " + rating + "\n");
  }
}