package AdapterDP;

/**
 * This class shows the details of a Tune in a different way.
 * @author David Eta
 * 
 */
public class Oldie implements Tune {
    
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;

    /**
     * This initialises the Oldie class with these required parameters.
     * @param artistName
     * @param songTitle
     * @param recordTitle
     * @param category
     */
    public Oldie(String artistName, String songTitle, String recordTitle, String category) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }

    /**
     * @return the first and last names of the artist separated by a space.
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * @return the song title and album name separated by spaces and a colon.
     */
    public String getDisplayTitle() {
        return songTitle + " : " + recordTitle;
    }

    /**
    * @return category.
    */
    public String getCategory() {
        return category;
    }
}
