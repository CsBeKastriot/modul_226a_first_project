package ab01;

import java.util.Scanner;

public class MastermindAB01 {

    public static void main(String[] args) {
        GameStart();
    }

    public static void GameStart() {
        System.out.println("Geben Sie einen Versuchscode mit vier Buchstaben aus der Menge {r,g,b,y,w} ein:");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.next();

        if(userInput.equals("") || userInput.equals(" ")) {
            System.out.println("Kein gültiger Inut!");
            GameStart();
        } else if(userInput.matches("\\d")) {
            System.out.println("Bitte geben Sie einen der oben erwähnten Buchstaben ein");
            GameStart();
        } else if(userInput.matches("r"+"g"+"b"+"y"+"w")) {
            String gameEnding = "Spiel beendet. Ihr geheimcode war " + String.format(userInput)+ ". Anzahl versuche: 5";
            System.out.println(gameEnding);
        }
    }
}
