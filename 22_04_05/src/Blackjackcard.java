public class Blackjackcard extends Card{


    public Blackjackcard(int suitNumber, int rankNumber) {
        super(suitNumber, rankNumber);
    }

    public int getValue(){

        String checkRank = this.getRank();

        if(checkRank == "ACE"){
            return 11;
        }
        else if(checkRank == "Jack" || checkRank == "Queen" || checkRank == "King"){
            return 10;
        }

        else
            return this.rankNumber;
    }

    public boolean isAce(){
        if(this.getRank() == "ACE"){
            return true;
        }
        else return false;
    }


}
