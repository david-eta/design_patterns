public class ExerciseIterator implements Iterator {

    private Exercise[] exercises;
    private int position = 0;

    public ExerciseIterator(Exercise[] exercises) {
        this.exercises = exercises;
    }

    public Boolean hasNext() {
        if (position < exercises.length-1) {
            return true;
        }
        return false;
    }

    public Exercise next() {
        if (hasNext()) {
            position += 1;
            return exercises[position-1];
        }
        else
            return null;
    }   
}
