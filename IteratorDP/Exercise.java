package IteratorDP;

/**
 * Creates an exercise.
 * @author David Eta
 * 
 */
import java.util.ArrayList;

public class Exercise {
    
    private String title;
    private ArrayList<String> targetMuscles = new ArrayList<String>();
    private ArrayList<String> directions = new ArrayList<String>();

    /**
     * initialises exercise based on all its details.
     * @param title the name of the exercises.
     */
    public Exercise(String title) {
        this.title = title;
    }

    /**
     * initialises exercise based on all its details.
     * @param details entails of the name of the exercises, muscles involved and steps to do it.
     */
    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;  
    }

    /**
     * adds an exercise to ArrayList of target muscles.
     * @param string muscle.
     */
    public void addTargetMuscle(String muscle) {
        targetMuscles.add(muscle);
    }

    /**
     * removes an exercise to ArrayList of target muscles.
     * @param string muscle.
     */
    public void removeTargetMuscle(String muscle) {
        targetMuscles.remove(muscle);
    }

    /**
     * returns the muscles separated by a comma and the directions in list form.
     * @return the muscles and directions.
     */
    public String toString() {
        
        String muscles = "Muscles: ";
        for (int i = 0; i < targetMuscles.size(); i++) {
            if (i == targetMuscles.size()-1)
                muscles = muscles + targetMuscles.get(i);
            else    
                muscles = muscles + targetMuscles.get(i) + ", ";
        }  

        String dirs = "Directions:\n";
        for (String direction: directions)
            dirs = dirs + "- " + direction + "\n";
        
        String ret = "\n... " + title + " ...\n" + muscles + "\n" + dirs;
        return ret;
    }
}
