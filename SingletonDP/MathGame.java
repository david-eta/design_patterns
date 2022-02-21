
import java.util.Scanner;
import java.util.Random;


/**
 * Runs a math game.
 * @author David Eta
 * 
 */
public class MathGame {
    
    private int score;
    private Random rand = new Random();
    private Scanner reader = new Scanner(System.in);
    private String[] operands = {"+", "-", "*", "/"};
    private static MathGame mathGame;


    /**
     * initialises a MathGame or calls the currently active one.
     * @return an instance of a game.
     */
    public static MathGame getInstance() {
        if (mathGame == null) {
        System.out.println("Let's have fun with Math!");
        mathGame = new MathGame();
        }
        return mathGame;
    }

    /**
     * Starts new rounds or ends the game depending on user input. 
     * Tallys the user's score.
     */
    public void play() {
        String input;
        boolean result;
        while (true) {
            System.out.print("(P)lay or (Q)uit: ");
            input = reader.next();  // p or q
            System.out.print("");
            

            if (input.toLowerCase().equals("p")) {
                result = mathGame.playRound();
                if (result == true)
                   score += 1;
                continue;
            }
            else if (input.toLowerCase().equals("q")) {
                System.out.println("You won " + score + " game(s)!");
                break;
            }
            System.out.println("Sorry, you must enter p or q"); 
        }
    }

    /**
     * Generates an arithmetic problem, and checks if the user returns the right answer to it.
     * @return if the user returned the right answer or not.
     */
    private boolean playRound() {

        int index = rand.nextInt(operands.length);
        String operand = operands[index];

        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);

        System.out.println("Round answer to 1 decimal place");
        System.out.printf("%d %s %d = ", num1, operand, num2);
        double userAnswer = reader.nextDouble();
        double realAnswer = getAnswer(operand, num1, num2);

        if (userAnswer == realAnswer) {
            System.out.println("You got it!");
            return true;
        }
        System.out.println("The correct answer is: " + realAnswer);
        return false;
    }

    /**
     * solves the randomly-generated arithmetic problem.
     * @return returns the correct answer.
     */
    private double getAnswer(String operand, int num1, int num2) {
        if (operand == "+")
            return num1 + num2;
        else if (operand == "-")
            return num1 - num2;
        else if (operand == "*")
            return num1 * num2;
        else
            return Math.round(((double)num1 / num2) * 10) / 10.0;
    }
}
