/**
 * Create by saurabh
 * Date: 12/11/23
 * Project Name: Java-8
 */
package consumer.movie;

public class Movie {
    String movieName;
    String movieHero;
    String movieHeroine;
    String movieDirector;

    public Movie(String movieName, String movieHero, String movieHeroine, String movieDirector) {
        this.movieName = movieName;
        this.movieHero = movieHero;
        this.movieHeroine = movieHeroine;
        this.movieDirector = movieDirector;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieHero() {
        return movieHero;
    }

    public void setMovieHero(String movieHero) {
        this.movieHero = movieHero;
    }

    public String getMovieHeroine() {
        return movieHeroine;
    }

    public void setMovieHeroine(String movieHeroine) {
        this.movieHeroine = movieHeroine;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieHero='" + movieHero + '\'' +
                ", movieHeroine='" + movieHeroine + '\'' +
                ", movieDirector='" + movieDirector + '\'' +
                '}';
    }
}
