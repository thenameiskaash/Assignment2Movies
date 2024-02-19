// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello movie enjoyer!");
    Scanner scnr = new Scanner(System.in);
    Movie[] movieCollection = new Movie[4];
    int highestRating = 0;
    int lowestRating = 10;
    String highestRatedMovie = "";
    String lowestRatedMovie = "";

    for (int index = 0; index < 4; index++) {
      System.out.println("Please enter the details of the movie: ");
      System.out.print("Title : ");
      String title = scnr.nextLine();
      System.out.print("Year : ");
      // Found this on stack overflow to read an input integer
      int year = Integer.parseInt(System.console().readLine()); 
      System.out.print("Director : ");
      String director = scnr.nextLine();
      System.out.print("Duration (mins) : ");
      int duration = Integer.parseInt(System.console().readLine());
      System.out.print("Actors : ");
      String actor = scnr.nextLine();
      System.out.print("Genre : ");
      String genre = scnr.nextLine();
      int rating = (int) (Math.random() * 10) + 1;

      movieCollection[index] = new Movie(title, year, director, duration, actor, genre, rating);

      
      if (rating > highestRating) {
        highestRating = rating;
        highestRatedMovie = title;
      }

      if (rating < lowestRating) {
        lowestRating = rating;
        lowestRatedMovie = title;
      }
    }

      System.out.println("Here are the details of all the movies: ");
      for (Movie movie : movieCollection){
        movie.print();
      
    }

    System.out.println("Movie with the highest rating: " + highestRatedMovie + " with the rating of " + highestRating);
    System.out.println("Movie with the lowest rating: " + lowestRatedMovie + " with the rating of " + lowestRating);
  }

}