package StateDP;

import java.util.ArrayList;

/**
 * Defines how a box will react to user input while in the French state
 * @author David Eta
 */
public class FrenchState implements State {

    private MusicBox box;

    /**
     * Initialises a box in this state
     * @param box
     */
    public FrenchState(MusicBox box) {
        this.box = box;
    }

    /**
     * Creates an arraylist of lyrics for the Star song in French
     * and calls function to print them out line by line
     */
    @Override
    public void pressStarButton() {
        ArrayList<String> lyrics = new ArrayList<String>();
        
        lyrics.add("Jouant: Petite Étoile Scintillante Scintillante");
        lyrics.add("Petite étoile scintillante scintillante");
        lyrics.add("Comment je me demande ce que vous êtes");
        lyrics.add("Au-dessus du monde si haut");
        lyrics.add("Comme un diamant dans le ciel");
        lyrics.add("Petite étoile scintillante scintillante");
        lyrics.add("Comment je me demande ce que vous êtes");
        
        box.playSong(lyrics);
    }

    /**
     * Creates an arraylist of lyrics for the Happy song in French
     * and calls function to print them out line by line
     */
    @Override
    public void pressHappyButton() {
        ArrayList<String> lyrics = new ArrayList<String>();

        lyrics.add("Jouant: Si Tu as D' la Joie au Coeur");
        lyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
        lyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
        lyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
        lyrics.add("Si tu as d' la joie au coeur, Frappe des mains");

        box.playSong(lyrics);
    }

    /**
     * Switches the state the box object is in to the English state
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("Switching to English...\n");
        box.setState(box.getEnglishState());
    }

    /**
     * Prints exception message
     */
    @Override
    public void pressFrenchButton() {
        System.out.println("You are already in French mode.\n");
    }

    /**
     * Switches the state the box object is in to the Spanish state
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish...\n");
        box.setState(box.getSpanishState());
    }

}