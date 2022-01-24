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

        ArrayList<String> temp = list;
        for(int i = 1; i < temp.size(); i++)  {
            int j = i - 1;
        
            while (j >= 0 && temp.get(i).compareTo(temp.get(j)) < 0) {
                temp.set(j+1, temp.get(j));
                j--;
            }
            temp.set(j+1, temp.get(i));
        }
        return temp;
    }
}
