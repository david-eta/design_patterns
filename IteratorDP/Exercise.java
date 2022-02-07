import java.util.ArrayList;

public class Exercise {
    
    private String title;
    private ArrayList<String> targetMuscles = new ArrayList<String>();
    private ArrayList<String> directions = new ArrayList<String>();

    public Exercise(String title) {
        this.title = title;
    }

    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;  
    }

    public void addTargetMuscle(String muscle) {
        targetMuscles.add(muscle);
    }

    public void removeTargetMuscle(String muscle) {
        targetMuscles.remove(muscle);
    }

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
        
        String ret = "... " + title + " ...\n" + muscles + "\n" + dirs;
        
        return ret;
    }
}
