package StateDP;

import java.util.ArrayList;

/**
 * Defines how a box will react to user input while in the Spanish state
 * @author David Eta
 */
public class SpanishState implements State {

    private MusicBox box;

    /**
     * Initialises a box in this state
     * @param box
     */
    public SpanishState(MusicBox box) {
        this.box = box;
    }

    /**
     * Creates an arraylist of lyrics for the Star song in Spanish
     * and calls function to print them out line by line
     */
    @Override
    public void pressStarButton() {
        ArrayList<String> lyrics = new ArrayList<String>();

        lyrics.add("Jugando: Brilla Brilla Pequeña Estrella");
        lyrics.add("Brilla brilla pequeña estrella");
        lyrics.add("Cómo me pregunto lo que eres");
        lyrics.add("Por encima del mundo tan arriba");
        lyrics.add("Como un diamante en el cielo");
        lyrics.add("Brilla brilla pequeña estrella");
        lyrics.add("Cómo me pregunto lo que eres");

        box.playSong(lyrics);
    }

    /**
     * Creates an arraylist of lyrics for the Happy song in Spanish
     * and calls function to print them out line by line
     */
    @Override
    public void pressHappyButton() {
        ArrayList<String> lyrics = new ArrayList<String>();

        lyrics.add("Jugando: Si Estás Contento y lo Sabes");
        lyrics.add("Si eres feliz y lo sabes, aplaude");
        lyrics.add("Si eres feliz y lo sabes, aplaude");
        lyrics.add("Si eres feliz y lo sabes, aplaude");
        lyrics.add("Si eres feliz y lo sabes, aplaude");

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
     * Switches the state the box object is in to the French state
     */
    @Override
    public void pressFrenchButton() {
        System.out.println("Switching to French...\n");
        box.setState(box.getFrenchState());
    }

    /**
     * Prints exception message
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("You are already in Spanish mode.\n");   
    }

}