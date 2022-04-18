package AdapterDP;

public abstract class Song {

    public abstract String getTitle();
    public abstract String getAlbum();
    public abstract String getArtistFirstName();
    public abstract String getArtistLastName();
    public abstract String getGenre();

    public String toString() {
        String ret = getTitle();
        ret += "\nAlbum: " + getAlbum();
        ret += "\nBy: " + getArtistFirstName() + getArtistLastName();
        ret += "\nGenre: " + getGenre() + "\n";
        return ret;
    }
    
    
}
