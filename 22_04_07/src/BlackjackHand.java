public class BlackjackHand extends Deck<BlackjackCard>{


    public int getValue(){
        String check;
        int valueSum = 0;

        for(BlackjackCard c : getCards()){
            check = c.getRank();

            if(check == "Jack" || check == "Queen" || check == "King"){
                valueSum += 10;
            }
            else if (check == "ACE"){
                if(valueSum + 11 > 21){ //가치가 21이상일 경우 ACE는 1의 가치
                    valueSum += 1;
                }
                else{ // 아니면 11의 가치를 가짐
                    valueSum += 11;
                }
            }
            else{ // 나머지 숫자
                valueSum += Integer.parseInt(check);
            }

        }

        return valueSum;
    }

    public boolean isBusted(){
        if(getValue() > 21)
            return true;
        else
            return false;
    }

    public boolean isBlackjack(){
        int cardCount = getCards().size();
        if(cardCount == 2 && this.getValue() == 21){
            return true;
        }
        else
            return false;
    }

}
