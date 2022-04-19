package AdapterDP;

/**
 * Creates a Track class
 * @author David Eta
 */
public class Track extends Song {
    
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;

    /**
     * Initialises the Track class with the required parameters.
     * @param title
     * @param album
     * @param firstName
     * @param lastName
     * @param genre
     */
    public Track(String title, String album, String firstName, String lastName, Genre genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    /**
     * @return the title of the Track.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the name of the album the Track was released in.
     */
    public String getAlbum() {
        return album;
    }

    /**
     * @return the first name of the Track's artist.
     */
    public String getArtistFirstName() {
        return firstName;
    }

    /**
     * @return the last name of the Track's artist.
     */
    public String getArtistLastName() {
        return lastName;
    }

    /**
     * @return the genre the Track fits in.
     */
    public String getGenre() {
        return genre.name();
    }
}
