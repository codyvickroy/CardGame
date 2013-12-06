/**
 *  Cody Vickroy
 *  Java 110 | UVM
 *  December 7th, 2013
 * 
 *  Its a game of cards, okay.
 */

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    
    ArrayList<Card> allCards = new ArrayList();
    ArrayList<Card> uCards = new ArrayList();
    ArrayList<Card> cCards = new ArrayList();
    
    /**
    * Makes a Person
    */
    public CardGame(){
        
    }//end CardGame constructor
    
    /**
    * sorts a deck of cards into two hands
    */
    public void setUp(){
        for(int i = 1 ; i <= 52; i++){
            int suit = (i/13) + 1;
            int rank = (i%13);
            Card c = new Card(suit,rank);
            allCards.add(c);
        }
        
        Collections.shuffle(allCards);
        for(int i = 1 ; i <= 52; i++){
            if(i <=26){
                uCards.add(allCards.get(i));
            }else{
                cCards.add(allCards.get(i));
            }
        }
    } //end cardSort
    
    public void play(){
        
        System.out.println("Welcome to the game!");
        boolean keepPlaying = true;
        while(keepPlaying == true){
        
            if(uCards.size() <= 0 || cCards.size() <= 0){
                break;
            }
            
            Card uCard = uCards.get(1);
            Card cCard = cCards.get(1);
            if(uCard.getRank() > cCard.getRank()){
                System.out.println("You Won the Draw!");
                System.out.println("Player: " + uCard.getRank() + " | Computer: " + cCard.getRank());
                Collections.rotate(uCards.subList(1,(uCards.size() + 1)),-1);
                uCards.add(cCard);
            }else if(uCard.getRank() < cCard.getRank()){
                System.out.println("You Lost the Draw!");
                System.out.println("Player: " + uCard.getRank() + " | Computer: " + cCard.getRank());
                Collections.rotate(cCards.subList(1,(cCards.size() + 1)),-1);
                cCards.add(uCard);
            }else{
                System.out.println("WAR!");
                if(uCards.size() <= 3 && cCards.size() <= 3){
                    System.out.println("Neither player can not finish the war and widespread peace breaks out D=");
                    break;
                }else if(uCards.size() <= 3){
                    System.out.println("Player can not finish the war and forfits");
                    break;
                }else if(cCards.size() <= 3){
                    System.out.println("Computer can not finish the war and forfits");
                    break;
                }
                
                System.out.println("Player: " + uCard.getRank() + " | Computer: " + cCard.getRank());
                Card uCard2 = uCards.get(2);
                Card uCard3 = uCards.get(3);
                Card cCard2 = cCards.get(2);
                Card cCard3 = cCards.get(3);
                if(uCard3.getRank() > cCard3.getRank()){
                    System.out.println("You Won the War!");
                    System.out.println("Player: " + uCard3.toString() + " | Computer: " + cCard3.toString());
                    System.out.println("You Won: " + cCard.toString() + " " + cCard2.toString() + " " + cCard3.toString());
                    Collections.rotate(uCards.subList(1,(uCards.size() + 1)),-1);
                    Collections.rotate(uCards.subList(1,(uCards.size() + 1)),-1);
                    Collections.rotate(uCards.subList(1,(uCards.size() + 1)),-1);
                    uCards.add(cCard);
                    uCards.add(cCard2);
                    uCards.add(cCard3);                    
                }else if(cCard3.getRank() > uCard3.getRank()){
                    System.out.println("You Lost the War!");
                    System.out.println("Player: " + uCard3.toString() + " | Computer: " + cCard3.toString());
                    System.out.println("You Lost: " + uCard.toString() + " " + uCard2.toString() + " " + uCard3.toString());
                    Collections.rotate(cCards.subList(1,(cCards.size() + 1)),-1);
                    Collections.rotate(cCards.subList(1,(cCards.size() + 1)),-1);
                    Collections.rotate(cCards.subList(1,(cCards.size() + 1)),-1);
                    cCards.add(uCard);
                    cCards.add(uCard2);
                    cCards.add(uCard3);
                }
            }   
        }
        
        if(uCards.size() <= 0){
            System.out.println("You Lost!");
        }else if(cCards.size() <= 0){
            System.out.println("You Won!");
        }
    } //end play
    
    
    
}//end class CardGame
