package sg.edu.rp.c346.mymovies;

import java.util.Calendar;

/**
 * Created by 17010578 on 25/7/2018.
 */

public class Movie {

    private String title;
    private String year;
    private String rated;
    private String genre;
    private String description;
    private String in_theatre;
    private Calendar watched_on;
    private int rating;

    public Movie(String title, String year, String rated, String genre, String description, String in_theatre, Calendar watched_on,int rating) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        this.description = description;
        this.in_theatre = in_theatre;
        this.watched_on = watched_on;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public Calendar getWatched_on() {
        return watched_on;
    }

    public void setWatched_on(Calendar watched_on) {
        this.watched_on = watched_on;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rated='" + rated + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                ", in_theatre='" + in_theatre + '\'' +
                ", watched_on=" + watched_on +
                ", rating='" + rating + '\'' +
                '}';
    }
}
