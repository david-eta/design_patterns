package CommandDP;

/**
 * @author David Eta
 */
public class JumpCommand implements Command {
    private Player player;

    /**
     * Creates a new JumpCommand
     * @param player the player that will be using the jump command
     */
    public JumpCommand(Player player) {
        this.player = player;
    }

    /**
     * Executes the jump command
     */
    public void execute() {
        player.jump();
    }
}