package AdapterDP;

import java.util.HashMap;

/**
 * Class that creates a jukebox and all its functionality.
 * @author David Eta
 * 
 */
public class JukeBox {

    private HashMap<String, Song> songs = new HashMap<String, Song>();

    /**
     * Creates an instance of a Jukebox.
     */
    public JukeBox() {}

    /**
     * Adds a song to the list of songs stored in the Jukebox.
     * @param song this is added to a hashmap with its title as the search key.
     */
    public void addSong(Song song) {
        songs.put(song.getTitle().toLowerCase(), song);
    }

    /**
     * @param songName searches for a song by this name and prints its details.
     * If there is no song by this name in this jukebox, a message is returned.
     */
    public void play(String songName) {
        songName = songName.toLowerCase();
        if (songs.containsKey(songName)) {
            System.out.println(songs.get(songName));
        }
        else {
            System.out.println("Sorry, this song is not in the jukebox.\n");
        }
        
    }
}
