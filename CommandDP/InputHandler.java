package CommandDP;

import java.util.HashMap;

/**
 * @author David Eta
 */
public class InputHandler {
    private HashMap<String, Command> commands = new HashMap<String, Command>();

    /**
     * Creates a hashmap of all the possible instructions the user can ask and their respective commands.
     * @param player calls the command for the player to make
     */
    public InputHandler(Player player) {
        commands.put("jump", new JumpCommand(player));
        commands.put("fire", new FireCommand(player));
        commands.put("run", new RunCommand(player));
        commands.put("quit", new QuitCommand(player));
    }

    /**
     * Runs the corresponding command to the instruction
     * @param button this is the instruction
     */
    public void buttonPressed(String button) {
        commands.get(button).execute();
    }
}
