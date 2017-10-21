import java.util.ArrayList;
/**
 * Write a description of class FavoritesMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FavoritesMediaLib
{
    public static void main(){
        String songs = MediaFile.readString();
        String copy = songs;
        int i = 1;
        ArrayList<String> names = new ArrayList<String>();
        
        ArrayList<String> rat = new ArrayList<String>();
        while(copy != " "){
            int firstThing = copy.indexOf("|");
            if(firstThing < 0) break;
            if(i % 2 == 1) names.add(copy.substring(0, firstThing));
            else rat.add(copy.substring(0, firstThing));
            copy = copy.substring(firstThing + 1);
            ++i;
        }
        /*for(int t = 0; t< names.size(); ++t){
            System.out.println("Title: " + names.get(t) + " Rating: " + rat.get(t));
        }*/
        System.out.println("My Favorite Songs");
        System.out.println("-----------------");
        for(int t = 0; t <names.size(); ++t){
            
            if(Integer.valueOf(rat.get(t)) > 7) System.out.println(names.get(t) + "(" + rat.get(t) + ")");
        }
        
        
    }
}
