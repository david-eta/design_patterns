public class RunCommand implements Command{
    private Player player;

    /**
     * This is the constructor for a RunCommand object.
     * @param player
     */
    public RunCommand(Player player) {
        this.player = player;
    }
    
    /**
     * This code executes the runForward command in conjunction with the Command class.
     */
    public void execute() {
        player.runForward();
    }
    
}
