package ab03;
import java.util.*;
import java.util.Random;

public class AB03 {

    public static void main (String[] args) {
        /*generateStars();*/

        /*the function below generates 10 lines of random 0 and X. There is always a maximum of 4 X in one line*/
        printRandomLines();
    }

    // The loop below draws a pyramid of stars.
    public static void generateStars() {
        // Initial for loop. i is 0 and the loop goes on until i < 5 and every time i is incremented.
        for (int i = 0; i < 5; i++) {
            // Same as above. This time we print " " out, since we will be printing the * close to each other.
            for (int j = 0; j < 5; j++) {
                System.out.print(" ");
            }
            // Looping again, this time we compare k with i and as long as k<=i, k is incremented with "* ".
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // AUFGABE XO
    public static String generadeRandomLine() {
        ArrayList<Character> characters= new ArrayList<>();
        Random random = new Random();

        // Characters to be added.
        Character X = 'X';
        Character O = 'O';

        // Generates random number from 0-4. That is why the + 1 is give. SO it's 0+1 (generates random number including 1-4)
        int k = random.nextInt(4) + 1;

        // Loops to get 1-4 X and the rest O's until a length of 10 is reached
        for (int i = 1; i <= k; i++) {
            characters.add(X);
        }
        while(characters.size()<10) {
            characters.add(O);
        }

        // Randomize the array a little
        Collections.shuffle(characters);

        // Get the index of the character X
        int indexOfX = characters.indexOf(X);

        // Check if index of X not 0 and swap if necessary.
        if (indexOfX != 0) {
            Collections.swap(characters, 0, indexOfX);
        }
        String str="";

        // Gets the Characters as one Line of X and O's
        for (int i = 0; i < 10; i++) {
            str = str + characters.get(i);
        }
        return "Zufallszahl:"+k+" "+str;
    }

    // Prints return value of generadeRandomeLines()
    public static void printRandomLines() {
        for (int i = 0; i <= 9; i++) {
            System.out.println("Zeile: "+i+" "+ generadeRandomLine());
        }
    }

}