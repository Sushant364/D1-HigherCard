/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package highercard;

/**
 *
 * @author aotsn
 */
import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Deck deck;
    private int rounds;
    private int player1Score;
    private int player2Score;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.deck = new Deck();
        this.rounds = 0;
        this.player1Score = 0;
        this.player2Score = 0;
    }

    public void play() {
        System.out.println("Higher Card Game Started!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rounds: ");
        int numRounds = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int round = 1; round <= numRounds; round++) {
            System.out.println("\nRound " + round + ":");
            System.out.println("Press Enter to get Player 1's card...");
            scanner.nextLine();
            Card card1 = deck.drawCard();

            System.out.println("Press Enter to get Player 2's card...");
            scanner.nextLine();
            Card card2 = deck.drawCard();

            player1.setCard(card1);
            player2.setCard(card2);

            player1.playCard();
            player2.playCard();

            int result = compareCards(card1, card2);

            if (result > 0) {
                player1Score++;
                System.out.println(player1.getName() + " wins the round!");
            } else if (result < 0) {
                player2Score++;
                System.out.println(player2.getName() + " wins the round!");
            } else {
                System.out.println("It's a tie for this round!");
            }

            rounds++;
        }

        System.out.println("\nGame Over!");
        System.out.println("Total rounds played: " + rounds);
        System.out.println(player1.getName() + "'s score: " + player1Score);
        System.out.println(player2.getName() + "'s score: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player2Score > player1Score) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("It's a tie! No winner in the game!");
        }
    }

    private int compareCards(Card card1, Card card2) {
        // For simplicity, let's assume Ace is the highest rank
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int rankIndex1 = java.util.Arrays.asList(ranks).indexOf(card1.getRank());
        int rankIndex2 = java.util.Arrays.asList(ranks).indexOf(card2.getRank());

        return Integer.compare(rankIndex1, rankIndex2);
    }
}



