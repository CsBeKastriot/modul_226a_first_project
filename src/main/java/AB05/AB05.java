package AB05;
import java.util.*;

public class AB05 {

    public static void main(String[] args) {

        for (int i = 1; i < 7; i++) {
            int xy = calculator(5, 1, i);
            System.out.println(xy);

        }
    }

    /**
     * The function below is nothing more than a simple calculator, that will calculate the difference between the two
     * opperands, depending on what kind of opperator is chosen.
     * @param operand1 first int value.
     * @param operand2 second int value.
     * @param operator the operator that is used to calculate.
     * @return the result of above mentioned operations as a switch statement.
     */
    public static int calculator(int operand1, int operand2, int operator) {

        return
                switch (operator) {
                    case 1 -> operand1 + operand2;
                    case 2 -> operand1 - operand2;
                    case 3 -> operand1 * operand2;
                    case 4 -> operand1 / operand2;
                    case 5 -> operand1 % operand2;
                    default -> throw new IllegalStateException("Falscher Operand eingegeben! Bitte geben Sie eine Zahl von 1-5 ein.");
                };
    }
}