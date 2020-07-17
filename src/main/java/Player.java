import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }


    public String getName() {
        return this.name;
    }

    public int handSize() {
        return this.hand.size();
    }

    public void addDealtCard(Card card) {
        this.hand.add(card);
    }
}