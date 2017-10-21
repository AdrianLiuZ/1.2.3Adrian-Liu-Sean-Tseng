
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
   static double totalCost = 0.0;
   static int numSongs = 0;
   static int totalRatings = 0;
   public static void main(String[] args){
       System.out.println("Welcome to your Media Library");
       Song song1 = new Song();
       Movies movie1 = new Movies();
       Books book1 = new Books();
       song1.setPrice(9.99);
       song1.setTitle("Thomas the Tank Engine. PBS");
       System.out.println(song1.getTitle() + ": " + song1.getPrice());
       song1.setRating(10);
       System.out.println(song1.getRating());
       movie1.setTitle("Thomas the Tank Movie. PBSS");
       System.out.println(movie1.getTitle());
       movie1.setRating(0);
       System.out.println(movie1.getRating());
       book1.setTitle("Thomas the Tank Book. PBSSS");
       System.out.println(book1.getTitle());
       book1.setRating(-10);
       System.out.println(book1.getRating());
       
       totalCost += song1.getPrice();
       Song song2 = new Song("big fish", 5, 1.29);numSongs += 1;
       Song song3 = new Song("bigg fish", 3, .99);numSongs += 1;
       Song song4 = new Song("biggg fish", 1, 1.29);numSongs += 1;
       Song song5 = new Song("bigggg fish", 10, .99);numSongs += 1;
       Song song6 = new Song("biggggg fish", 8, .99);numSongs += 1;
       Song song7 = new Song("bigggggg fish", 4, 1.29);numSongs += 1;
       Song song8 = new Song("biggggggg fish", 6, .99);numSongs += 1;
       totalCost += song2.getPrice();
       totalCost += song3.getPrice();
       totalCost += song4.getPrice();
       totalCost += song5.getPrice();
       totalCost += song6.getPrice();
       totalCost += song7.getPrice();
       totalCost += song8.getPrice();
       
       totalRatings += song1.getRating();
       totalRatings += song2.getRating();
       totalRatings += song3.getRating();
       totalRatings += song4.getRating();
       totalRatings += song5.getRating();
       totalRatings += song6.getRating();
       totalRatings += song7.getRating();
       totalRatings += song8.getRating();
       System.out.println(totalCost);
       //testing a calculation:
       double avgtotalCost = totalCost/numSongs;
       System.out.printf("Average Total Cost: %.3f\n", avgtotalCost);
       
       double aveRating = totalRatings/numSongs;
       System.out.println(aveRating);
       
       movie1.setDur(125);
       movie1.movieform();
       MediaFile.writeString(song1.getTitle() + "|" + song3.getRating());
       MediaFile.writeString(song2.getTitle() + "|" + song2.getRating());
       MediaFile.writeString(song3.getTitle() + "|" + song3.getRating());
       MediaFile.writeString(song4.getTitle() + "|" + song3.getRating());
       MediaFile.writeString(song5.getTitle() + "|" + song3.getRating());
       MediaFile.writeString(song6.getTitle() + "|" + song3.getRating());
       MediaFile.writeString(song7.getTitle() + "|" + song3.getRating());
       MediaFile.writeString(song8.getTitle() + "|" + song3.getRating());
       
       MediaFile.saveAndClose();
}
}