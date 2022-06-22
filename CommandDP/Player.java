package CommandDP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author David Eta
 */
public class Player {

	private final int frame_time = 100;
	
	/**
	 * initialises an instance of the player
	 */
	public Player() {
        System.out.println("Our hero is born");
    }
	
	/**
     * Reads and prints the jump file 6 lines at a time.
     */
	public void jump() {

        readPrintFile(6, "jump.txt");
	}
	
	/**
     * Reads and prints the fire file 3 lines at a time.
     */
	public void fire() {
        readPrintFile(3, "fire.txt");
	}

	/**
     * Reads and prints the run file 3 lines at a time.
     */
    public void runForward() {	
		readPrintFile(3, "run.txt");
	}

	/**
     * This function reads a file printing a certain number of lines at a time.
     * @param lines the number of lines read at a time
	 * @param file_name the name of the file being read
     */
	private void readPrintFile(int lines, String fileName) {
		try {
			File file = new File(fileName);
			Scanner sc;
			sc = new Scanner(file);
			
			int i = 1;
		
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				if (i % lines == 0) {
					sleep(frame_time);
					clear();
				}
				i += 1;
			}
			clear();
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
	
	// Ms. Portia's Code to sleep/pause
	private void sleep(int num) {
	    try {
	        TimeUnit.MILLISECONDS.sleep(num);
	    } catch (Exception e) {
	        System.out.println("Timmer error");
	    }
	}

	// Ms. Portia's Code to clear the terminal
	private void clear() {
	    System.out.print("\033[H\033[2J");
	}
}


