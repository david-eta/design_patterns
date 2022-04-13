package StateDP;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Class that creates a music box and all its functionality
 * @author David Eta
 * 
 */
public class MusicBox {

    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * Initialises a music box
     */
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);

        state = new EnglishState(this); // default initial condition
    }

    /**
     * @param state
     * sets the current state to the parameter
     */
    public void setState(State state) {
		this.state = state;
	}

    /**
     * returns the English state
     */
    public State getEnglishState() {
        return englishState;
    }

    /**
     * returns the French state
     */
    public State getFrenchState() {
        return frenchState;
    }

    /**
     * returns the Spanish state
     */
    public State getSpanishState() {
        return spanishState;
    }

    /**
     * calls the star button on the state variable
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /**
     * calls the happy button on the state variable
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

    /**
     * calls the English button on the state variable
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    /**
     * calls the French button on the state variable
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    /**
     * calls the Spanish button on the state variable
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }
    
    /**
     * @param lyrics
     * Slowly prints out the lyrics of the song line by line. 
     */
    public void playSong(ArrayList<String> lyrics) {
        
        System.out.println(); // line space

        for (String line : lyrics) {
            System.out.println(line);

            try {
                TimeUnit.SECONDS.sleep(1);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // line space
    }
}