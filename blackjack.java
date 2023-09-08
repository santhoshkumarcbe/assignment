

import java.util.Scanner;

import Blackjack.Deck;

public class blackjack {
    

    public static void main(String[] args) {
        
        //Welcome note
        System.out.println("Welcome to KSK's BlackJack !");

        // playing deck
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.Shuffle();
        // create a deck for the player
        Deck playerDeck=new Deck();

        Deck dealerDeck=new Deck();
        float playerMoney=100;
        Scanner userinput = new Scanner(System.in);

        // game loop
        while(playerMoney>0){
            //play on
            // bet
            System.out.println("You have " + playerMoney + " jack coins, how much would you like to bet ?"); 
            float playerbet=userinput.nextFloat();
            if(playerbet > playerMoney){
                System.out.println("You cannot bet more than you have. Please leave");
                break;
            }

            boolean endRound=false;

            //start
            //player get two cards
            playerDeck.draw(playingDeck);
            playerDeck.draw(playingDeck);

            //dealer get two cards
            dealerDeck.draw(playingDeck);
            dealerDeck.draw(playingDeck);

            while(true){
                System.out.println("Your hand :" +playerDeck.toString());
                System.out.println("Your hand is valued at :"+playerDeck.cardsValue());

                // Display dealer hand 
                System.out.println("Dealer hand: "+ dealerDeck.getCard(0).toString() + "[Hidden]");


                // what does the player want to do 
                System.out.println("Would you like to Hit (1) or Stand (2)");
                int response = userinput.nextInt();
                if(response==1){
                    playerDeck.draw(playingDeck);
                    System.out.println("You draw a:"+playerDeck.getCard(playerDeck.deckSize()-1).toString());
                    // bust if > 21
                    if(playerDeck.cardsValue() > 21){
                        System.out.println("Bust. Currently valued at: "+playerDeck.cardsValue());
                        playerMoney-=playerbet;
                        endRound=true;
                    }
                }


                if(response==2){
                    break;
                }
            }

            //reveal the dealer
            System.out.println("Dealer Cards: "+dealerDeck.toString());
            if(dealerDeck.cardsValue() > playerDeck.cardsValue() && endRound==false){
                System.out.println("Dealer beats you!");
                playerMoney-=playerbet;
                endRound=true;
            }
            // dealer draws at 16,stand at 17
            while(dealerDeck.cardsValue() < 17 && endRound==false){
                dealerDeck.draw(playingDeck);
                System.out.println("Dealer Draws:"+dealerDeck.getCard(dealerDeck.deckSize()-1).toString());
            }

            //display total value for dealer
            System.out.println("Dealer's hand is Valued at :"+dealerDeck.cardsValue());
            // find if dealer busted
            if(dealerDeck.cardsValue() > 21 && endRound==false){
                System.out.println("Dealer busts ! you win."); 
                playerMoney+=playerbet;
                // System.out.println("You have "+playerMoney );
                endRound=true;

            }

             // find if dealer busted
             if(playerDeck.cardsValue() > 21){
                        System.out.println("Bust. Currently valued at: "+playerDeck.cardsValue());

                        playerMoney-=playerbet;
                        endRound=true;
                    }

            //determine if push 
            if(playerDeck.cardsValue()==dealerDeck.cardsValue() && endRound==false ){
                System.out.println("push");
                endRound=true;
            }

            if(playerDeck.cardsValue()>dealerDeck.cardsValue() && endRound==false){
                System.out.println("You win the  hand");
                playerMoney+=playerbet;
                endRound=true;
            }
            else if(endRound==false){
                System.out.println("You lose the hand");
                playerMoney-=playerbet;
                endRound=true;
            }

            playerDeck.moveAllToDeck(playingDeck);
            dealerDeck.moveAllToDeck(playingDeck);
            System.out.println("End of hand. ");
            userinput.close();
            

        }

        System.out.println("Game over ! You are out of jack coins ");

        // System.out.println(playingDeck);

    }

    
}

