package AdapterDP;

import java.util.HashMap;

public class JukeBox {

    private HashMap<String, Song> songs = new HashMap<String, Song>();
    private int currentSong;

    public JukeBox() {

    }

    public void addSong(Song song) {
        songs.put(song.getTitle().toLowerCase(), song);
    }

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
