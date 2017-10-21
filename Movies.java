
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movies
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private int duration;
    /**
     * Constructor for objects of class Song
     */
    public Movies()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        duration = 0;
    }
    public void setDur(int d) {
        duration = d;
    }
    public int getDur() {
        return duration;
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
    
    public void movieform(){
        int minutes = duration % 60;
        int hours = (duration - minutes) / 60 ;
        System.out.println("Hours: " + hours + "    Minutes: " + minutes);
    }
}
