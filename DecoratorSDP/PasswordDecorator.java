package DecoratorSDP;
/**
 * Abstract class that parents different ways to strengthen password
 * @author David Eta
 * 
 */
public abstract class PasswordDecorator extends Password {

    protected Password passwordBeginning;

    public PasswordDecorator(Password passwordBeginning) {
		this.passwordBeginning = passwordBeginning;
	}

	public abstract String getPassword();
}