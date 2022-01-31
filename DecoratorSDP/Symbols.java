import java.util.HashMap;

public class Symbols extends PasswordDecorator {
	private String password;	

	public Symbols(Password passwordBeginning) {
		super(passwordBeginning);
		this.password = passwordBeginning.getPassword();
		
	}

	public String getPassword() {
		symbolSwap();
		return password;
	}

	private void symbolSwap() {
		HashMap<String, String> my_dict = new HashMap<String, String>();

		my_dict.put("a", "@");
		my_dict.put("b", "8");
		my_dict.put("e", "3");
		my_dict.put("g", "9");
		my_dict.put("i", "!");
		my_dict.put("o", "0");
		my_dict.put("s", "$");
		my_dict.put("t", "7");


        for (int i = 0; i < password.length(); i++) {
 
			String my_char = Character.toString(password.charAt(i));
			char symbol = my_dict.get(my_char).charAt(0);

			if (my_dict.get(my_char) == null) 
				continue;
			else 
				password = password.substring(0, i) + symbol + password.substring(i+1);		
        }
    }
	
	
}