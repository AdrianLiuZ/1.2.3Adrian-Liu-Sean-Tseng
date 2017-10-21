
/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    public static void main(){
        String songInfo = MediaFile.readString();
        while (songInfo != null){
            System.out.println(songInfo);
            songInfo = MediaFile.readString();
        }
    }
}
