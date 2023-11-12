/**
 * Create by saurabh
 * Date: 12/11/23
 * Project Name: Java-8
 */
package consumer.movie;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MovieDetails {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Tiger3","Salman","Katrina","YRF"));
        movieList.add(new Movie("LSD","Aamir","Karina","Jio"));
        movieList.add(new Movie("Jawan","Sharukh Khan","Dipika","Atlee"));

        Consumer<Movie> getMovieDetail = s -> {
            System.out.println("Movie is :"+s.movieName);
            System.out.println("Heroine is :"+s.movieHeroine);
            System.out.println("Director is :"+s.movieDirector);
        };

        for (Movie movie:movieList) {
            getMovieDetail.accept(movie);
        }
    }
}
