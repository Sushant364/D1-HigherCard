/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package highercard;



/**
 *
 * @author aotsn
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of player 1: ");
        String playerName1 = scanner.nextLine();
        Player player1 = new Player(playerName1);

        System.out.print("Enter the name of player 2: ");
        String playerName2 = scanner.nextLine();
        Player player2 = new Player(playerName2);

        Game game = new Game(player1, player2);
        game.play();
    }
}



