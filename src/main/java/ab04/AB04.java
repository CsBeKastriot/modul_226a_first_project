package ab04;
import java.util.*;
import java.util.Random;

public class AB04 {

    public static void main (String[] args) {
        generateNumbers();
    }

    public static void generateNumbers() {
        Random random = new Random();
        int[] randomNumbers = new int[30];

        // Loop to generate random Numbers
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(50) + 1;
        }
        // Print out randomNumbers as a string
        System.out.println("Unsortierte Zahlen: "+Arrays.toString(randomNumbers));

        // Define new array as sortedNumbers. At the moment empty but with the length of randomNumbers
        int[] sortedNumbers = new int[randomNumbers.length];

        // Here I use arraycopy to copy the values into the new array. SourceArray, IndexToStart, DestinationArray, IndexToStart, LengthOfArray.
        System.arraycopy(randomNumbers, 0, sortedNumbers, 0, randomNumbers.length);

        // Sort numbers generated in randomNumber. Finally something I somehow can comprehend.
        Arrays.sort(sortedNumbers);

        // Print sorted array
        System.out.println("Sortierte Zahlen: "+Arrays.toString(sortedNumbers));

        // Set int for the Index
        int biggerIndex = 0;

        // Loop through every Element in the SourceArray and see if number is bigger than that in the sorted array.
        for (int j = 0; j < randomNumbers.length; j++) {
            if (sortedNumbers[j] < randomNumbers[j]) {
                biggerIndex++;
            }
        }
        System.out.println("An " + biggerIndex +" Positionen waren im unsortierten Array grössere Zahlen");
    }
}