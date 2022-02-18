package DecoratorSDP;

import java.util.Random;

/**
 * Removes all spaces and adds a number to the end of user's password.
 * @author David Eta
 * 
 */
public class EasyPassword extends Password {

    /**
     * Makes a password of the phrase.
     * @param phrase will be turned into a password
     */
	public EasyPassword(String phrase) {
		this.password = makeEasy(phrase);
	}

	/**
     * @return password of password class.
     */
	public String getPassword() {
		return password;
    }

    /**
     * @param phrase removes all spaces and adds a random number at the end of phrase.
     */
    private String makeEasy(String phrase) {
        phrase = phrase.replaceAll("\\s", ""); // removes all spaces in phrase

        // generates a random number between 0 and 100
        Random rand = new Random();
        int num = rand.nextInt(101); 

        phrase = phrase + num; // concatenates the number to the phrase
        
        return phrase;
    }
}
