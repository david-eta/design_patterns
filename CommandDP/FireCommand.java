/**
 * Class to initialize and execute fire command
 * @author Christina Desmangles
 */
public class FireCommand implements Command{
    private Player player;

    /**
     * creates a new instance of fire command
     * @param player the player using the command
     */
    public FireCommand(Player player) {
        this.player = player;
    }
    
    /**
     * Executes the fire command 
     */
    public void execute() {
        player.fire();
    }
    
}
