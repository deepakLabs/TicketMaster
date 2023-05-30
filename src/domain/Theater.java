package domain;

import java.util.HashMap;

public class Theater {
    HashMap<String,Movie> movies;

    String theaterId;

    public Theater(HashMap<String, Movie> movies, String theaterId) {
        this.movies = movies;
        this.theaterId = theaterId;
    }

    public HashMap<String, Movie> getMovies() {
        return movies;
    }

    public String getTheaterId() {
        return theaterId;
    }
}
