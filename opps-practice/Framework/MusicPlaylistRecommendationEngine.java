import java.util.LinkedList;

public class MusicPlaylistRecommendationEngine {

    // LinkedList to store recently played songs
    static LinkedList<String> recentlyPlayed = new LinkedList<>();

    // Add a newly played song
    public static void playSong(String song) {

        // Remove if already present (to avoid duplicates in history)
        if (recentlyPlayed.contains(song)) {
            recentlyPlayed.remove(song);
        }

        // Add song at the beginning
        recentlyPlayed.addFirst(song);

        // Keep only latest 10 songs
        if (recentlyPlayed.size() > 10) {
            String removedSong = recentlyPlayed.removeLast();
            System.out.println("Removed Oldest Song: " + removedSong);
        }

        System.out.println(song + " is now playing.");
    }

    // Search for a song
    public static void searchSong(String song) {

        if (recentlyPlayed.contains(song)) {
            System.out.println(song + " is present in Recently Played.");
        } else {
            System.out.println(song + " is NOT present in Recently Played.");
        }
    }

    // Display recently played songs
    public static void displayPlaylist() {

        System.out.println("\n===== Recently Played Songs =====");

        if (recentlyPlayed.isEmpty()) {
            System.out.println("No songs played yet.");
            return;
        }

        int count = 1;

        for (String song : recentlyPlayed) {
            System.out.println(count + ". " + song);
            count++;
        }

        System.out.println("Total Songs in History: " + recentlyPlayed.size());
    }

    public static void main(String[] args) {

        playSong("Shape of You");
        playSong("Believer");
        playSong("Perfect");
        playSong("Senorita");
        playSong("Faded");
        playSong("Levitating");
        playSong("Closer");
        playSong("Havana");
        playSong("Despacito");
        playSong("Attention");

       
        playSong("Blinding Lights");

        
        searchSong("Believer");
        searchSong("Shape of You");

     
        displayPlaylist();
    }
}