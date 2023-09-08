package Blackjack;


import java.util.ArrayList;
import java.util.Random;

//  interface InterfaceDeck {
//     public void createFullDeck();
//     public void Shuffle();

    
// }


public class Deck {
    private ArrayList<Card> cards;

    //constructor
    public Deck(){
        this.cards= new ArrayList<Card>();
    }

    public void createFullDeck(){
        for(Suit cardSuit:Suit.values()){
            for(Value cardValue:Value.values()){
                this.cards.add(new Card(cardSuit, cardValue));
            }
        }
    }

    public void Shuffle(){
        ArrayList<Card> tmpDeck = new ArrayList<Card>();
        Random random = new Random();
        int randomCardIndex=0;
        int originalSize=this.cards.size();
        for(int i=0;i<originalSize;i++){
            // generate random index random.nextInt((max-min)+1)+min;
            randomCardIndex = random.nextInt((this.cards.size()-1-0)+1)+0;
            tmpDeck.add(this.cards.get(randomCardIndex));
            this.cards.remove(randomCardIndex);
        }  
        this.cards =tmpDeck;
    }

    public String toString(){
        String cardListOutput ="";
        for(Card aCard : this.cards){
            cardListOutput+= "\n"   +aCard.toString() + "-";
            
        }
        return cardListOutput;
    }

    public void removeCard(int i){
        this.cards.remove(i);
    } 

    public Card getCard(int i){
        return this.cards.get(i);
    }

    public void addCard(Card addCard){
        this.cards.add(addCard);
    }

    //Draws from the Deck

    public void draw(Deck comingfrom){
        this.cards.add(comingfrom.getCard(0));
        comingfrom.removeCard(0);
    }

    public int deckSize(){
        return this.cards.size();
    }

    public void moveAllToDeck(Deck moveTo){

        int thisDeckSize=this.cards.size();

        //put cards into moveTo deck
        for(int i=0;i<thisDeckSize;i++){
            moveTo.addCard(this.getCard(i));
        }

        for(int i=0;i<thisDeckSize;i++){
            this.removeCard(0);
        }
    }

    // return total value of cards in deck
    public int cardsValue(int winVal){
        int totalvalue=0;
        int aces=0;

        for(Card aCard : this.cards){
            switch(aCard.getValue()){
                case TWO : totalvalue+=2;break;
                case THREE : totalvalue+=3;break;
                case FOUR : totalvalue+=4;break;
                case FIVE: totalvalue+=5;break;
                case SIX: totalvalue+=6;break;
                case SEVEN : totalvalue+=7;break;
                case EIGHT : totalvalue+=8;break;
                case NINE : totalvalue+=9;break;
                case TEN : totalvalue+=10;break;
                case JACK : totalvalue+=10;break;
                case KING : totalvalue+=10;break;
                case QUEEN : totalvalue+=10;break;
                case ACE : aces+=1;break;  
            }
        }

        for(int i=0;i<aces;i++){
            if(totalvalue> winVal / 2){
                totalvalue+=1;
            }
            else
            totalvalue+=11;
        }
        return totalvalue;
    }
}
