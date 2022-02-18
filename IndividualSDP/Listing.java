package IndividualSDP;

import java.util.ArrayList;

/**
 * Holds an ArrayList that can be added to, removed from and sorted.
 * @author David Eta
 * 
 */
public class Listing implements SortBehavior {
    
    private String title;
    private ArrayList<String> items = new ArrayList<String>();
    private SortBehavior sortBehavior = new BubbleSort();

    /**
     * Creates a new list that has only a title.
     * @param name title of the list
     */
    public Listing(String title) 
    {
        this.title = title;
    }

    /**
     * Creates a new list with specified attributes.
     * @param names The title, list and the sorting technique.
     */
    public Listing(String title, ArrayList<String> items, SortBehavior sortBehavior) 
    {
        this.title = title;
        this.items = items;
        this.sortBehavior = sortBehavior; 
    }

    /**
     * Adds a user-specified item to the list.
     * @param new_item Adds this item to the list.
     */
    public void add (String item)
    {
        items.add(item);
    }

    /**
     * Removes a user-specified item from the list.
     * @param unwanted_item Removes this item from the list.
     */
    public void remove (String item)
    {
        items.remove(item);
    }

    /**
     * Creates a new list that has only a title.
     * @return the list title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Specifies the sort behaviour according to user preferrence.
     * @param sortbehaviour The sortBehaviour
     */
    public void setSortBehavior(SortBehavior sortBehavior)
    {
        this.sortBehavior = sortBehavior;
    }

    /**
     * Sorts the user's list using the specified sort behaviour
     * @return array list
     */
    public ArrayList<String> sort(ArrayList<String> data)
    {
        return this.sortBehavior.sort(data);
    }

    /**
     * Returns the sorted list
     * @return array list
     */
    public ArrayList<String> getSortedList() 
    {
        return this.sortBehavior.sort(this.items);
    }

    /**
     * Returns the user's list with no sorting applied to it
     * @return array list
     */
    public ArrayList<String> getUnSortedList() 
    {
        return this.items;
    }
    
}
