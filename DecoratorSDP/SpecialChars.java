
import java.util.Random;

class SpecialChars extends PasswordDecorator {	
    private String password;

	public SpecialChars(Password passwordBeginning) {
		super(passwordBeginning);
        this.password = passwordBeginning.getPassword();
	}

	public String getPassword() {
		changeCase();
        return password;	
	}

	private void changeCase() {
        
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
	
    private char popRandom() {
        char[] specials = {'*', '!', '%', '+', '.', '{', '}'};
        return specials[new Random().nextInt(specials.length)];  
    }
	
}