package AdapterDP;

/**
 * Class that converts the details of a tune and adapts them to match the format of a song.
 * @author David Eta
 * 
 */
public class SongAdapter extends Song {
    
    private Tune tune;

    /**
     * Initialises the class
     * @param tune
     */
    public SongAdapter(Tune tune) {
        this.tune = tune;
    }

    /**
     * @return the song's title by parsing the tune's display title and selecting its respective part.
     */
    public String getTitle() {
        String display = tune.getDisplayTitle();
        int index = 0;

        for (int i = 0; i < display.length(); i++) {
            if (display.charAt(i) == ':') {
                index = i-1;
                break;
            }
        }
        return display.substring(0, index);
    }

    /**
     * @return the song's title by parsing the tune's display title and selecting its respective part.
     */
    public String getAlbum() {
        String display = tune.getDisplayTitle();
        int index = 0;

        for (int i = 0; i < display.length(); i++) {
            if (display.charAt(i) == ':') {
                index = i+1;
                break;
            }
        }
        return display.substring(index+1, display.length());
    }

    /**
     * @return the song's album by parsing the name of the tune's artist and selecting its respective part.
     */
    public String getArtistFirstName() {
        return tune.getArtistName().split(" ")[0];
    }

    /**
     * @return the song's album by parsing the name of the tune's artist and selecting its respective part.
     */
    public String getArtistLastName() {
        return tune.getArtistName().split(" ")[1];
    }

    /**
     * @return the song's genre of the tune.
     * If a song genre is identified in the category, that genre is assigned. If not, it is categorised as an OTHER genre.
     */
    public String getGenre() {
        String[] words = tune.getCategory().split("\\s+");

        for (String word: words) {
            for (Genre g : Genre.values()) {
                if (g.name().equals(word.toUpperCase())) {
                    return g.name();
                }
            }
        }
        return Genre.OTHER.name();
    }

}
