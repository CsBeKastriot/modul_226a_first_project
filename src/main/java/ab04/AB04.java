package ab04;
import java.util.*;
import java.util.Random;

public class AB04 {

    public static void main (String[] args) {
        generateNumbers();
        calculateTemperature();
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

    // Creates 3 dimensional arrays and fills them with values between 20 and 30
    public static void calculateTemperature() {
        // seting my Variables
        int days = 6;
        int locations = 3;
        int time = 4;

        // generating a multidienstion array...
        int [][][] temp = new int[days][locations][time];

        // To generate random numbers from 20-30 in Java
        Random random = new Random();
        int temperature = random.nextInt(20 + 1) + 20;

        // Fill the arrays with random values
        for (int newDays = 0; newDays < days; newDays++) {
            for (int newLocation = 0; newLocation < locations; newLocation++) {
                for (int newTime = 0; newTime < time; newTime++) {
                    temp[newDays][newLocation][newTime] = temperature;
                }
            }
        }
    }

    // The function below gets the minimal value out of every array
    public static int getMinValue() {
        // generating a multidienstion array...
        int [][][] temp = new int[0][0][0];

        // define new zero value for temp
        int minimum = temp[0][0][0];

        // Loop through every element in every array and at the end compare the 0 values of minimum to temp.
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                for (int k = 0; k < temp[i][j].length; k++) {
                    if (temp[i][j][k] < minimum) {
                        minimum = temp[i][j][k];
                    }
                }
            }
        }
        return minimum;
    }
}