
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Books
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    /**
     * Constructor for objects of class Song
     */
    public Books()
    {
        // initialise instance variables
        rating = 0;
        title = "";
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
}
