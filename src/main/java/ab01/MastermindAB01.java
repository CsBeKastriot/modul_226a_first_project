package ab01;

import java.util.Scanner;
import java.util.regex.*;

public class MastermindAB01 {

    public static void main(String[] args) {
        gameStart();
    }

    public static void gameStart() {
        System.out.println("Geben Sie einen Versuchscode mit vier Buchstaben aus der Menge {r,g,b,y,s,w} ein:");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.next();

        // Checks userInput to match the following patters.
        // To learn more about regex see the following link: https://www.javatpoint.com/java-regex
        if(Pattern.matches("\\s+", userInput) || Pattern.matches("\\W+", userInput)) {
            System.out.println("Kein gültiger Inut!\n");
            gameStart();
        } else if(Pattern.matches("[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)", userInput) || Pattern.matches("\\W+", userInput)) {
            System.out.println("Bitte geben Sie einen der oben erwähnten Buchstaben ein.\n");
            gameStart();
        } else if(Pattern.matches("[a-z&&[rgbysw]]{1,2}", userInput)) {
            String gameEnding = "Spiel beendet. Ihr geheimcode war " + userInput+ ". Anzahl versuche: 5";
            System.out.println(gameEnding);
        }
    }
}
