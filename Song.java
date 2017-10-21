
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favorite;
    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        price = 0.0;
        title = "";
        favorite = false;
    }
    public Song(String title) {
        this.title = title;
    }
    public Song(String title, double price) {
        this.title = title;
        this.price = price;
    }
    public Song(String title, int rating, double price) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }
    public void setTitle(String t) {
        title = t;
    }
    public String getTitle() {
        return title;
    }
    public void setRating(int i) {
        rating = i;
    }
    public int getRating(){
        return rating;
    }
    public void setPrice(double i) {
        price = i;
    }
    public double getPrice(){
        return price;
    }
    public void addToFavorites() {
        favorite = true;
    }
}