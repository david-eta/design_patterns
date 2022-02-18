package IndividualSDP;

import java.util.ArrayList;

/**
 * Interface that parents the sort behaviours.
 * @author David Eta
 * 
 */
public interface SortBehavior {
    
    /**
     * Method that is implemented by children.
     * @param array_list the user's list
     */
    public ArrayList<String> sort(ArrayList<String> data);

}
