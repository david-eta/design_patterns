package DecoratorSDP;import java.util.Random;


/**
 * Changes the case of each letter 50% of the time
 * @author David Eta
 * 
 */
class RandomCasing extends PasswordDecorator {	
    private String password;

    /**
     * Sets the value of the password to the string value of the password-type parameter.
     * @param password
     */
	public RandomCasing(Password passwordBeginning) {
		super(passwordBeginning);
        this.password = passwordBeginning.getPassword();
	}

    /**
     * Calls the method that randomly changes the case of password characters.
     * @return password with random casing
     */
	public String getPassword() {
		changeCase();
		return password;
	}

    /**
     * Takes the password and makes it uppercase one in two times.
     */
	private void changeCase() {

        for (int i = 0; i < password.length(); i++) {

            int ascii = (int) password.charAt(i);

            if (ascii > 96 && ascii < 123)
            {    
                int x = new Random().nextInt(2); // generates either 0 or 1
                char upper = Character.toUpperCase(password.charAt(i));

                if (x == 1) // 50% chance of this being true
                    password = password.substring(0, i) + upper + password.substring(i+1);
            }
        }

    }
	
	
}