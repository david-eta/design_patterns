/**
 * Initialises a physical therapist and all their characteristics.
 * @author David Eta
 * 
 */
import java.util.ArrayList;

public class PT {
    
    int max_size = 2;
    int x = 0; // number of items
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;

    /**
     * initialises the physical therapist and the exercises they offer.
     * @param details the first name, last name and a bit about the PT.
     */
    public PT(String firstName, String lastName, String bio) {

        exercises = new Exercise[max_size];
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
    }

    /**
     * adds an exercise to the list of exercises. If the list of exercises has reached its limit, it is expanded by calling the respective function
     * @param details entails of the name of the exercise, muscles involved and steps to do it.
     */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {

        Exercise exercise = new Exercise(title, muscleGroups, directions); 
        if (x >= max_size) {
            exercises = growArray(exercises);
            max_size = exercises.length;
        }
        exercises[x] = exercise;
        x += 1; 
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getBio() {
        return bio;
    }
    
    /**
     * if the list of exercises has reached its limit, its size is doubled.
     * @param details list of exercises.
     */
    public Exercise[] growArray(Exercise[] exercises) {
        Exercise[] temp = new Exercise[2 * exercises.length];
        System.arraycopy(exercises, 0, temp, 0, exercises.length);

        return temp;
    }
    
    public ExerciseIterator createIterator() {
        return new ExerciseIterator(exercises);
    }
    
    public String toString() {
        String ret = firstName + " " + lastName + "\n" + bio + "\n";
        return ret;
    }

}
