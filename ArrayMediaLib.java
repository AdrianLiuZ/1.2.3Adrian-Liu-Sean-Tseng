
/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{
    public static void main(){
        String[] sharingFriends = {"Adrian", "Sean", "Rishabh", "John", "Michael"};
        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        Song[] topTenSongs = {new Song("The Twist"), 
                              new Song("Smooth"),     
                              new Song("Mack the Knife"), 
                              new Song("How do I live"),  
                              new Song("Party Rock Anthem"),  
                              new Song("I gotta feeling"),  
                              new Song("Macarena"),  
                              new Song("Physical"),  
                              new Song("You light up my Life"),  
                              new Song("Hey Jude")
                            };
        int total = 0;
        for(int i = 0; i< sharingFriends.length; i++) {
            System.out.println(sharingFriends[i]);
        }
        for(int t: daysBtwnPurchase) {
            total += t;
        }
        for (Song s: topTenSongs) {
            System.out.println(s.getTitle());
        }
        System.out.println(total);
        /**
        Number 20-21
        for(int i = 0; i < topTenSongs.length; i++){
            topTenSongs[i] = new Song("test");
        }
        for (Song s: topTenSongs) {
            System.out.println(s.getTitle());
        }**/
        int i = 0;
        for(Song s : topTenSongs){
            
            i++;
            if(i % 3 == 0){
                s.setPrice(0.99);
            }
            else{
                s.setPrice(1.29);
            }
            
        }
        for (Song s : topTenSongs){
            System.out.println(s.getTitle() + " " + s.getPrice());
        }
        int index = SongFinder.findTitle(topTenSongs, "Mack the Knife");
        if (index >=0 ) {
                System.out.println("Found " + topTenSongs[index].getTitle());
        }
        else  {
                System.out.println("Song not found!");
        }
        
        
        
        index = SongFinder.getIndexLastDiscount(topTenSongs, 1.00);
        if (index >= 0 ) {
            System.out.println("Discount found " + topTenSongs[index].getTitle());
        }
        else {
            System.out.println("No songs are discounted");
        }
        
        
        
        System.out.println("--Find last song --");
        index = SongFinder.getIndexLastTitle(topTenSongs);
        if (index >= 0 ) {
            System.out.println("Last title: " + topTenSongs[index].getTitle());
        }
        else {
            System.out.println("You have a blank title!");
        }
    }
}