package AdapterDP;

/**
 * This class initialises the details of a song and prints them out.
 * @author David Eta
 * 
 */
public abstract class Song {

    public abstract String getTitle();
    public abstract String getAlbum();
    public abstract String getArtistFirstName();
    public abstract String getArtistLastName();
    public abstract String getGenre();

    /**
     * @return the details of a song in the specified format.
     */
    public String toString() {
        String ret = getTitle();
        ret += "\nAlbum: " + getAlbum();
        ret += "\nBy: " + getArtistFirstName() + getArtistLastName();
        ret += "\nGenre: " + getGenre() + "\n";
        return ret;
    }
    
    
}
