/**
 *  Cody Vickroy
 *  Java 110 | UVM
 *  October 7, 2013
 * 
 *  Card Stuffs
 */

public class Card {
    
    public static final int SPADES = 1, 
                            CLUBS = 2,
                            HEARTS = 3,
                            DIAMONDS = 4;
    public static final int ACE = 1,
                            JACK = 11,
                            QUEEN = 12,
                            KING = 13;                    
    int rank, suit;
    String rankName, suitName;
    

    /**
    * Does Card stuff
    * @param suit
    * @param rank
    */ 
    public Card(int suit, int rank){
        
        if(suit == 1){
            suitName = "Spades";
        }else if(suit == 2){
            suitName = "Clubs";
        }else if(suit == 3){
            suitName = "Hearts";
        }else if(suit == 4){
            suitName = "Diamonds";
        }
        
        if(rank == 1){
            rankName = "Ace";
        }else if(rank == 11){
            rankName = "Jack";
        }else if(rank == 12){
            rankName = "Queen";
        }else if(rank == 13){
            rankName = "King";
        }else{
            rankName = Integer.toString(rank);
        }
        
    } //end default construtors

    /**
    * returns
    * @return 
    */     
    public int getSuit(){
        return suit;
    } //end getSuit
    
    /**
    * returns
    * @return 
    */ 
    public int getRank(){
        return rank;
    } //end getRank
    
    /**
    * returns
    * @return 
    */     
    public String getSuitName(){
        return suitName;
    } //end getSuit
    
    /**
    * returns
    * @return 
    */ 
    public String getRankName(){
        return rankName;
    } //end getRank    
    
    /**
    * returns
    * @return 
    */ 
    public boolean equals(Card otherCard){
        
        if (otherCard.getRank() == rank){
            return true;
        }
            return false;
        
    } //end equals

    /**
    * returns
    * @return 
    */ 
    public String toString(){
            return rankName+" of "+suitName;
    }//end toString
    
} //end Card
