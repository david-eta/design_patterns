package CommandDP;

/**
 * @author David Eta
 */
public class QuitCommand implements Command {
    private Player player;

    /**
     * Creates the command that ends the game.
     * @param player the player instance that will call the jump command
     */
    public QuitCommand(Player player) {
        this.player = player;
    }
    
    /**
     * Prints out the game over screen
     */
    public void execute() {
        System.out.println("Game over :(");
    }
    
}
