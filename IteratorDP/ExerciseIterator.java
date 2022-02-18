package IteratorDP;

/**
 * Takes an array of exercises and iterates through them to return an exercise if there are more.
 * @author David Eta
 * 
 */
public class ExerciseIterator implements Iterator {

    private Exercise[] exercises;
    private int position = 0;

    /**
     * initialises exercise array.
     * @param exercises an array of exercises.
     */
    public ExerciseIterator(Exercise[] exercises) {
        this.exercises = exercises;
    }

    /**
     * finds out if the index position is at the end of the array or not.
     * @return true or false 
     */
    public Boolean hasNext() {
        if (position < exercises.length-1) 
            return true;
        return false;
    }

    /**
     * if there is another exercise after one in the current position, it is returned.
     * @returns an exercise.
     */
    public Exercise next() {
        if (!hasNext()) 
            return null;
        position += 1;
        return exercises[position-1];
    }   
}
