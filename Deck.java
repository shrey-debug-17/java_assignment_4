import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Constructor to create the deck
    public Deck() {
        createDeck();
    }

    // Create and initialize the deck
    public void createDeck() {
        deck = new ArrayList<>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    // Print the full deck
    public void printDeck() {
        for (Card card : deck) {
            card.printCard();
        }
    }

    // Shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled!");
    }

    // Search for a specific card
    public boolean findCard(String suit, String rank) {
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit) && card.getRank().equalsIgnoreCase(rank)) {
                return true;
            }
        }
        return false;
    }

    // Deal 5 random cards
    public void dealCard() {
        Random rand = new Random();
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            int randomIndex = rand.nextInt(deck.size());
            deck.get(randomIndex).printCard();
        }
    }
}
