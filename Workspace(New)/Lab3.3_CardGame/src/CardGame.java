import java.util.Stack;


public class CardGame {

        public static void main(String[] args) {

            // Create a deck and add cards to it
            Stack<Card> deck = new Stack<>();
            deck.push(new Card("2-D"));
            deck.push(new Card("3-C"));
            deck.push(new Card("7-S"));
            deck.push(new Card("J-H"));
            deck.push (new Card ("A-H"));

            // Create the discard pile
            Stack<Card> discardPile = new Stack<>();

            // Start the game
            SimpleCardGame game = new SimpleCardGame();
            game.setDeck(deck);
            game.setDiscardPile(discardPile);

            // The first player draws 3 cards from the deck
            Card card1 = game.getCardFromDeck();
            Card card2 = game.getCardFromDeck();
            Card card3 = game.getCardFromDeck();

            System.out.println("Which cards went to the first player?");
            System.out.println(card1);
            System.out.println(card2);
            System.out.println(card3);

            // The first player discards 3 of his cards
            game.discard(card1);
            game.discard(card2);
            game.discard(card3);

            System.out.println("What cards are in the discard pile?");
            System.out.println(game.getDiscardPile().pop());
            System.out.println(game.getDiscardPile().pop());
            System.out.println(game.getDiscardPile().pop());

            // TODO-Lab3.3: Implement a 2 player go-fish game.


        }

}
