import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        while (true) {
            System.out.println("\n=== CARD DECK MENU ===");
            System.out.println("1. Print Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Find a Card");
            System.out.println("4. Deal 5 Random Cards");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    deck.shuffleDeck();
                    break;
                case 3:
                    System.out.print("Enter card suit: ");
                    String suit = scanner.nextLine();
                    System.out.print("Enter card rank: ");
                    String rank = scanner.nextLine();
                    if (deck.findCard(suit, rank)) {
                        System.out.println("Card is in the deck.");
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case 4:
                    deck.dealCard();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
