
public class Movie {
    private String  title;
    private String studio;
    private String rating;

    public Movie(String  title,String studio,String rating)
    {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String  title,String studio)
    {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    public static Movie[] getPG( Movie[] movielist )
    {
        Movie[] MovieListRatedPG = new Movie[movielist.length];
        int j = 0;
        for (Movie movie : movielist) {
            if (movie.rating.contains("PG")) {
                MovieListRatedPG[j++] = new Movie(movie.title, movie.studio, movie.rating);
            }
        }
        return MovieListRatedPG;
    }

    public static void main(String args[])
    {
        Movie [] movies = new Movie[3];
        movies[0] = new  Movie("Inception","ABC","GOOD");
        movies[1] = new Movie("Saving Private Ryan","xyz","PG-13");
        movies[2] = new Movie("Forest Gump","QWERTY","PG-13");

        Movie [] m;
        m = getPG(movies);
        for (Movie movie : m) {
            System.out.println(movie.title + " " + movie.studio + " " + movie.rating );
        }
    }
}
