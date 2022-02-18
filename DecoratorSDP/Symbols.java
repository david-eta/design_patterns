package DecoratorSDP;

import java.util.HashMap;

/**
 * Inserts special characters into the password string.
 * @author David Eta
 * 
 */
public class Symbols extends PasswordDecorator {
	private String password;	

	/**
     * Sets the value of the password to the string value of the password-type parameter.
     * @param password.
     */
	public Symbols(Password passwordBeginning) {
		super(passwordBeginning);
		this.password = passwordBeginning.getPassword();	
	}

	/**
     * Calls the method that swaps certain characters with respective symbols.
     * @return password with characters replaced by symbols.
     */
	public String getPassword() {
		symbolSwap();
		return password;
	}

	/**
     * Swaps any characters in the password that are in the hashmap with their corresponding values.
     * @return nothing
     */
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

			if(my_dict.get(my_char) != null){
				char symbol = my_dict.get(my_char).charAt(0);
				password = password.substring(0, i) + symbol + password.substring(i+1);		
			}
        }
    }
	
	
}