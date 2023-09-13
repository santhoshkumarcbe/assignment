package Blackjack;

public class Card {
    private Suit suit;
    private Value value;

    // time complexity O(1)
// space complexity O(n)

    public Card(Suit suit, Value value){
        this.suit=suit;
        this.value=value;
    }

    public String toString(){
        return this.suit.toString() +"-" + this.value.toString();
    }

    public Value getValue(){
        return this.value;
    }

    
}
