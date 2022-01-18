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
        boolean sorted = false;
    
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                for(int j=0; j < list.size()-2; j++) {
                }
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }

        return list;
    }
}
