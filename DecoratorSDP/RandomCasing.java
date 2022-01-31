import java.util.Random;

class RandomCasing extends PasswordDecorator {	

	public RandomCasing(Password passwordBeginning) {
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
                int x = new Random().nextInt(2); // generates either 0 or 1 (50/50 chance)
                char upper = Character.toUpperCase(password.charAt(i));

                if (x == 1)
                    continue;
                else
                    password = password.substring(0, i) + upper + password.substring(i+1);
            }
        }

    }
	
	
}