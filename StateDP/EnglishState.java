package StateDP;

import java.util.ArrayList;

/**
 * Defines how a box will react to user input while in the English state
 * @author David Eta
 */
public class EnglishState implements State {

    private MusicBox box;

    /**
     * Initialises a box in this state
     * @param box
     */
    public EnglishState(MusicBox box) {
        this.box = box;
    }

    /**
     * Creates an arraylist of lyrics for the Star song in English
     * and calls function to print them out line by line
     */
    @Override
    public void pressStarButton() {
        ArrayList<String> lyrics = new ArrayList<String>();

        lyrics.add("Playing: Twinkle Twinkle Little Star");
        lyrics.add("Twinkle twinkle little star");
        lyrics.add("How I wonder what you are");
        lyrics.add("Up above the world so high");
        lyrics.add("Like a diamond in the sky");
        lyrics.add("Twinkle twinkle little star");
        lyrics.add("How I wonder what you are");

        box.playSong(lyrics);
    }

    /**
     * Creates an arraylist of lyrics for the Happy song in English
     * and calls function to print them out line by line
     */
    @Override
    public void pressHappyButton() {
        ArrayList<String> lyrics = new ArrayList<String>();

        lyrics.add("Playing: If You're Happy And You Know It");
        lyrics.add("If you're happy and you know it, clap your hands");
        lyrics.add("If you're happy and you know it, clap your hands");
        lyrics.add("If you're happy and you know it, clap your hands");
        lyrics.add("If you're happy and you know it, clap your hands");

        box.playSong(lyrics);
    }

    /**
     * Prints exception message
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("You are already in English mode.\n");        
    }

    /**
     * Switches the state the box object is in to the French state
     */
    @Override
    public void pressFrenchButton() {
        System.out.println("Switching to French...\n");
        box.setState(box.getFrenchState());
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