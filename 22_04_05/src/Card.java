public class Card {
    public final int suitNumber;
    public final int rankNumber;


    public Card(int suitNumber, int rankNumber) {
        this.suitNumber = suitNumber;
        this.rankNumber = rankNumber;
    }

    public String getSuit(){ // suit 반환
        if (this.suitNumber == 1)
            return "Clubs";
        else if(this.suitNumber == 2)
            return "Hearts";
        else if(this.suitNumber == 3)
            return "Diamonds";
        else// ==4
            return "Spades";
    }

    public String getRank(){ // rank반환
        if(rankNumber == 1) // rankName
            return "ACE";
        else if(rankNumber == 11)
            return "Jack";
        else if (rankNumber == 12)
            return "Queen";
        else if (rankNumber == 13)
            return "King";
        else
            return String.valueOf(rankNumber);
    }

    public String toString(){
        return getRank() + " of " + getSuit();
    }


}
