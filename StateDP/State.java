package StateDP;

/**
 * Interface that parents the different states
 * @author David Eta
 */
public interface State {
	/**
	 * Functionality that is extended to the children states
	 */
	public void pressStarButton();
	public void pressHappyButton();
	public void pressEnglishButton();
    public void pressFrenchButton();
    public void pressSpanishButton();
}