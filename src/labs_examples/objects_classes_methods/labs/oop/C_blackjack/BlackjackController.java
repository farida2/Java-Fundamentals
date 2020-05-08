package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;
import java.util.Random;

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
        Player user = new Player();
        Player computer = new Player();
        Deck deck = new Deck();

        deck.deal(user);
        deck.deal(computer);
        deck.deal(user);
        deck.deal(computer);

        System.out.println("The user's hand is: ");
        user.getHand().printHand();
        System.out.println("The computer's hand is: ");
        computer.getHand().printHand();
    }
}
  // This POJO contains the player info
   class Player{
       private String name;
       private Hand hand = new Hand();
       private int potValue; //(the amount of money they have)

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public Hand getHand() {
          return hand;
      }

      public void setHand(Hand hand) {
          this.hand = hand;
      }

      public int getPotValue() {
          return potValue;
      }

      public void setPotValue(int potValue) {
          this.potValue = potValue;
      }
  }

   // This POJO holds the card data
    class  Card {
        private char suit;
        private int cardValue ;


       public Card(char suit, int cardValue) {
           this.suit = suit;
           this.cardValue = cardValue;
       }

       public char getSuit() {
           return suit;
       }

       public void setSuit(char suit) {
           this.suit = suit;
       }

       public int getCardValue() {
           return cardValue;
       }

       public void setCardValue(int cardValue) {
           this.cardValue = cardValue;
       }

       @Override
       public String toString() {
           return "Card{" +
                   "suit=" + suit +
                   ", cardValue=" + cardValue +
                   '}';
       }
   }

    // This POJO holds the deck data
    class Deck {
        Card[] cards;
        ArrayList<Integer> usedCards = new ArrayList<>();
        char[] suit = new char[]{'♠', '♦', '♥', '♣'};

        public Deck() {
            populateCards();
        }

        /*
                In the Deck.java class, create a method that will populate the Card[] with 52 unique Card object. The cards
                should mimic an actual card deck. It should contain four aces (spades, hearts, diamonds, clubs), four 2's
                (spades, hearts, diamonds, clubs), four 3's (spades, hearts, diamonds, clubs), ... up through Jacks, Queens and Kings
                 Four suits : spades, hearts, diamonds, clubs
                 Thirteen ranks: ace(1), 2,3,4,5,6,7,8,9,10,Jacks, Queens and Kings,
                 */
        public void populateCards(){
            this.cards = new Card[52];
            int count = 0;
            for(int i = 0; i < 4; i++){
                for(int j = 1; j <= 13; j++){
                   Card c = new Card(suit[i], j);
                   cards[count] = c;
                   count++;
                }
            }
        }

        public void deal(Player player) {
            Random rand = new Random();
            int index = rand.nextInt(51);
            while(usedCards.contains(index)){
                index = rand.nextInt(51);
            }
            usedCards.add(index);
            player.getHand().getCards().add(cards[index]);
        }
    }

    // This POJO holds Hand data
    class  Hand {
        private ArrayList<Card> cards = new ArrayList<>();
        private int handValue;

        public ArrayList<Card> getCards() {
            return cards;
        }

        public void setCards(ArrayList<Card> cards) {
            this.cards = cards;
        }

        public int getHandValue() {
            int value = 0;
            for(Card c : cards){
                if(c.getCardValue() <= 10){
                    value += c.getCardValue();
                }
                else{
                    value += 10;
                }
            }
            return handValue;
        }


        public void printHand() {
            for(Card c : cards){
                System.out.println(c.toString());
            }
        }
    }
