package AdapterDP;

public class SongAdapter extends Song {
    
    private Tune tune;

    public SongAdapter(Tune tune) {
        this.tune = tune;
    }

    public String getTitle() {
        return tune.getDisplayTitle().split(" ")[0];
    }

    public String getAlbum() {
        return tune.getDisplayTitle().split(" ")[2];
    }

    public String getArtistFirstName() {
        return tune.getArtistName().split(" ")[0];
    }

    public String getArtistLastName() {
        return tune.getArtistName().split(" ")[1];
    }

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
