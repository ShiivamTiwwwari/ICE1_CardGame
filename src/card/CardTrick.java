/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier by Shivam Tiwari 991757759  
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7]; 
        Random rand = new Random();

        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card(); 
            c.setValue(rand.nextInt(13) + 1); 
            c.setSuit(Card.SUITS[rand.nextInt(4)]); 
            magicHand[i] = c;
        }

       
        System.out.println("Magic hand:");
        for (Card c : magicHand) {
            System.out.println(c.getSuit() + " " + c.getValue());
        }

       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int userValue = input.nextInt();
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitIndex = input.nextInt();

        String userSuit = Card.SUITS[suitIndex];
        boolean found = false;

     
        for (Card c : magicHand) {
            if (c.getValue() == userValue && c.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }

  
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

   
        Card luckyCard = new Card();
        luckyCard.setValue(7); 
        luckyCard.setSuit("Hearts"); 

        System.out.println("Lucky card: " + luckyCard.getSuit() + " " + luckyCard.getValue());

      
        found = false;  // Reset the found variable
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() && c.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

 
        if (found) {
            System.out.println("Congratulations! The lucky card is in the magic hand!");
        } else {
            System.out.println("Sorry, the lucky card is not in the magic hand.");
        }
    }
}


    

