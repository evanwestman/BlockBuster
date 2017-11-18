
public class Movie extends MediaObj {
    
    // Fields
    public String genre;
    public double durationHrs;
    public String rating;
    public String movieType;
    
    // Constructors
    public Movie() {
        genre = null;
        durationHrs = 0.0;
        rating = null;
        movieType = null;
    }
    
    public Movie(String aGenre, double aTime, String aRating, String aType) {
        genre = aGenre;
        durationHrs = aTime;
        rating = aRating;
        movieType = aType;
    }
    
    // Setters
    public void setGenre(String aGenre) {
        genre = aGenre;
    }
    public void setDurationHrs(double aTime) {
        durationHrs = aTime;
    }
    public void setRating(String aRating) {
        rating = aRating;
    }
    public void setMovieType(String aMovieType) {
        movieType = aMovieType;
    }
    public void setRentalPeriod(Integer aPeriod) {
        rentalPeriod = aPeriod;
    }
    
    // Getters
    public String getGenre() {
        return genre;
    }
    public double getDurationHrs() {
        return durationHrs;
    }
    public String getRating() {
        return rating;
    }
    public String getMovieType() {
        return movieType;
    }
}
