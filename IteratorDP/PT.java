import java.util.ArrayList;

public class PT {
    
    int max_size = 2;
    int x = 0; // number of items
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;

    public PT(String firstName, String lastName, String bio) {

        exercises = new Exercise[max_size];
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
    }

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
    
    public Exercise[] growArray(Exercise[] exercises) {
        Exercise[] temp = new Exercise[2 * exercises.length];
        System.arraycopy(exercises, 0, temp, 0, exercises.length);

        return temp;
    }
    
    public ExerciseIterator createIterator() {
        return new ExerciseIterator(exercises);
    }
    
    public String toString() {
        String ret = firstName + " " + lastName + "\n" + bio + "\n\n";
        return ret;
    }

}
