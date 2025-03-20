import java.util.Scanner;

public class SimpleDeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of players and cards per player
        System.out.print("Enter the number of players: ");
        int players = scanner.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int cards = scanner.nextInt();

        // Initialize and shuffle the deck
        String[] deck = createDeck();
        shuffleDeck(deck);

        // Distribute cards and print results
        String[][] distributedCards = distributeCards(deck, players, cards);
        printCards(distributedCards);

        scanner.close();
    }

    // Method to create a deck of 52 cards
    public static String[] createDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int players, int cards) {
        if (players * cards > deck.length) {
            System.out.println("Not enough cards for the given number of players and cards per player.");
            return new String[0][0];
        }

        String[][] playerHands = new String[players][cards];
        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                playerHands[i][j] = deck[index++];
            }
        }
        return playerHands;
    }

    // Method to print players' cards
    public static void printCards(String[][] playerHands) {
        for (int i = 0; i < playerHands.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : playerHands[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}
