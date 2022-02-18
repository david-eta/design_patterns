package ObserverSDP;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Initialises a hashmap of the votes and offers options on how they can be tallied
 * @author David Eta
 * 
 */
public class StudentGovPoll implements Subject {

    private ArrayList<Observer> observers;
    private HashMap<String, Integer> votes;
    private String school;
    private int numUpdates;

    /**
     * Initialises the ArrayList of observer options and the HashMap of votes.
     * @param school_name name of the school holding the election
     */
    public StudentGovPoll(String school) {
        
        observers = new ArrayList<Observer>();
        votes = new HashMap<String, Integer>();
        this.school = school;
    }


    /**
     * Adds a user-specified observer.
     * @param new_observer Adds this observer to the list.
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes a user-specified observer from the list.
     * @param unwanted_observer Removes this observer from the list.
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies the user by updating with new votes
     * @return null
     */
    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(votes);
        }     
    }

    /**
     * Adds a new candidate to the HashMap.
     * @param name name of a candidate
     */
    public void addCandidate(String president) {
        votes.put(president, 0);
    }

    /**
     * Updates the number of votes a specified candidate has.
     * @param presidentXvotes the candidate and the votes they have
     */
    public void enterVotes(String president, int num)
    {
        int old_val = votes.get(president);
        votes.replace(president, old_val + num);
        numUpdates += 1;

        if (numUpdates % 4 == 0)
            notifyObservers();    
    }

    public String getSchool() {
        return school;
    }
}
