// Name: Shrey Ardeshana
// PRN: 23070126019
// Batch: AIML

public class Card {
    private String suit;
    private String rank;

    // Constructor
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getter Methods
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    // Print a single card
    public void printCard() {
        System.out.println(rank + " of " + suit);
    }

    // Check if two cards have the same suit
    public boolean sameCard(Card other) {
        return this.suit.equals(other.suit);
    }

    // Check if two cards have the same rank
    public boolean compareCard(Card other) {
        return this.rank.equals(other.rank);
    }
}
