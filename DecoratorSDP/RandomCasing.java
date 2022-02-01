import java.util.Random;

class RandomCasing extends PasswordDecorator {	
    private String password;

	public RandomCasing(Password passwordBeginning) {
		super(passwordBeginning);
        this.password = passwordBeginning.getPassword();
	}

	public String getPassword() {
		changeCase();
		return password;
	}

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