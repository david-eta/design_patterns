import java.util.HashMap;
import java.util.Map;

/**
 * Displays the candidates and how many votes each has.
 * @author David Eta
 * 
 */
public class TallyDisplay implements Observer {
    
    Subject poll;
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();

    /**
     * Uses the bubble sort technique to sort an array list.
     * @param array_list
     * @return sorted array list
     */
    public TallyDisplay(Subject poll)
    {
        this.poll = poll;
        poll.registerObserver(this);
    }

    /**
     * Udates the hashmap with the new values and shows the data.
     * @param hash_map
     */
    public void update(HashMap<String, Integer> votes)
    {
        this.votes = votes;
        display();
    }

    /**
     * Prints out the candidates and the number of votes they have.
     * @param none
     */
    private void display()
    {
        System.out.println("Current Tallies:\n");
        
        for (Map.Entry<String, Integer> vote : votes.entrySet()) { 
            System.out.println(vote.getKey() + " : " + vote.getValue());
        }
        System.out.println();
    }
}
