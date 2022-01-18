import java.util.ArrayList;


/**
 * Sorts an array list using the insertion sort method.
 * @author David Eta
 * 
 */
public class InsertionSort implements SortBehavior {
    
    /**
     * Uses the insertion sort technique to sort an array list.
     * @param array_list
     * @return sorted array list
     */
    public ArrayList<String> sort(ArrayList<String> list) { // https://stackoverflow.com/questions/35097227/insertion-sort-java-algorithm-in-an-arraylist-string 

        for(int i = 1; i < list.size(); i++)  {
            int j = i - 1;
        
            while (j >= 0 && list.get(i).compareTo(list.get(j)) < 0) {
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, list.get(i));
        }
        return list;
    }
}
