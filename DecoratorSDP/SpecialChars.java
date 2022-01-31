
import java.util.Random;

class SpecialChars extends PasswordDecorator {	

	public SpecialChars(Password passwordBeginning) {
		super(passwordBeginning);
	}

	public String getPassword() {
		changeCase(password);
		return password;
	}

	private void changeCase(String password) {

        for (int i = 0; i < password.length(); i++) {

            int ascii = (int) password.charAt(i);
            if (ascii < 97 || ascii > 122) 
                continue;
            else {
                int x = new Random().nextInt(3); // generates either from 0 to 8

                if (x != 0 | x != 1 || x != 2) // 30% chance of x not being either of these
                    continue;
                else
                    password = password.substring(0, i) + popRandom() + password.substring(i);
            }
        }

    }
	
    private char popRandom() {
        char[] specials = {'*', '!', '%', '+', '.', '{', '}'};
        return specials[new Random().nextInt(specials.length)];  
    }
	
}