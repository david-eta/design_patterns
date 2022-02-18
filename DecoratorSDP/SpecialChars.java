package DecoratorSDP;
import java.util.Random;

/**
 * Inserts special characters into the password string
 * @author David Eta
 * 
 */
class SpecialChars extends PasswordDecorator {	
    private String password;

    /**
     * Sets the value of the password to the string value of the password-type parameter
     * @param password
     */
	public SpecialChars(Password passwordBeginning) {
		super(passwordBeginning);
        this.password = passwordBeginning.getPassword();
	}

    /**
     * Calls the method that adds special characters to the password
     * @return password with special characters
     */
	public String getPassword() {
		addSpecial();
        return password;	
	}

    /**
     * Inserts a randomly selected special character into the password 30% of the time.
     * @return nothing
     */
	private void addSpecial() {
        
        int i = 0;
    
        while (i < password.length()) {
            int ascii = (int) password.charAt(i);

            if (ascii > 96 && ascii < 123) {
                int x = new Random().nextInt(9); // generates 1 of 9 digits (0-8) 
                if (x < 3)  // 30% chance of nothing happening
                    password = password.substring(0, i) + popRandom() + password.substring(i);
            }
            i++;
        }
    }
	
    /**
     * Randomly selects a symbol from a given array.
     * @return special character
     */
    private char popRandom() {
        char[] specials = {'*', '!', '%', '+', '.', '{', '}'};
        return specials[new Random().nextInt(specials.length)];  
    }
	
}