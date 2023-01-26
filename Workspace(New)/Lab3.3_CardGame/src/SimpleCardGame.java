import java.util.Stack;
public class SimpleCardGame {
    // Draw deck
    private Stack<Card> deck;

    // Discard pile
    private Stack<Card> discardPile;

    public Card getCardFromDeck() {
        return deck.pop();
    }

    public void discard(Card card) {
        discardPile.push(card);
    }

    public Card lookAtTopCard() {

        return deck.peek();
    }

    public void setDeck(Stack<Card> deck)
    {
        this.deck = deck;
    }

    public void setDiscardPile(Stack<Card> discardPile){
        this.discardPile = discardPile;
    }

    public Stack<Card> getDiscardPile(){
        return discardPile;
    }


}
