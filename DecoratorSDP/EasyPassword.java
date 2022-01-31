import java.util.Random;

public class EasyPassword extends Password {

	public EasyPassword(String phrase) {
		this.password = phrase;
	}
	
	public String getPassword() {
        password = makeEasy(password);
		return password;
    }

    private String makeEasy(String phrase) {
        phrase = phrase.replaceAll("\\s", ""); // removes all spaces in phrase

        // generates a random number between 0 and 99
        Random rand = new Random();
        int num = rand.nextInt(100); 

        phrase = phrase + num; // concatenates the number to the phrase
        
        return phrase;
    }
}
