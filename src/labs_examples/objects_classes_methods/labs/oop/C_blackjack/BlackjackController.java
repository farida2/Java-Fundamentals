package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

/*
 *  Created by Farida Belhous 05/01/2020
 *  The blackjack game
 *  The game we'll be creating will be very simple. It will be "closest to 21". The player
 *  who's hand value is closest to 21 without going over at the end of the game will win.
 *  It will not ask for bets.
 *  The user and the computer will each start with a small pot and bets will be taken automatically.
 */

public class BlackjackController {
    public static void main(String[] args) {

    }
}
  // This POJO contains the player info
   class Player{
       String name;
       Hand hand;
       int potValue; //(the amount of money they have)

   }

   // This POJO holds the card data
    class  Card {
        char[] suit = new char[]{'♠', '♦', '♥', '♣'};
        int cardValue;

    }

    // This POJO holds the deck data
    class Deck {
        Card[] cards;
        ArrayList<Integer> usedCards;

        /*
        In the Deck.java class, create a method that will populate the Card[] with 52 unique Card object. The cards
        should mimic an actual card deck. It should contain four aces (spades, hearts, diamonds, clubs), four 2's
        (spades, hearts, diamonds, clubs), four 3's (spades, hearts, diamonds, clubs), ... up through Jacks, Queens and Kings

         */
        public Card[] PopulateCards(){
            return cards;
        }

    }

    // This POJO holds Hand data
    class  Hand {
        ArrayList<Card> cards;
        int handValue;
    }
