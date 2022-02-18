package IndividualSDP;

import java.util.ArrayList;

/**
 * Sorts an array list using the bubble sort method.
 * @author David Eta
 * 
 */
public class BubbleSort implements SortBehavior {
    
    /**
     * Uses the bubble sort technique to sort an array list.
     * @param array_list
     * @return sorted array list
     */
    public ArrayList<String> sort(ArrayList<String> list) {

        String temp;
        ArrayList<String> temp_list = list;
        boolean sorted = false;
    
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < temp_list.size()-1; i++) {
                for(int j=0; j < temp_list.size()-2; j++) {
                }
                if (temp_list.get(i).compareTo(temp_list.get(i + 1)) > 0) {
                    temp = temp_list.get(i);
                    temp_list.set(i, temp_list.get(i + 1));
                    temp_list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }

        return temp_list;
    }
}
