import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    // mvc왜 쓰냐, 서비스는 왜 구분하냐?

    private ArrayList<Card> cards = new ArrayList<>();

    public ArrayList<Card> getCards(){
        return cards;
    }

    public void addCard(Card card){ // 카드 목록 출력
        cards.add(card);
    }

    public void print(){
        for(Card c : cards){
            System.out.println(c.toString());
        }
    }

    public void shuffle(){
       Collections.shuffle(cards);
    }

    /*
    public void shuffle(){
    //강사님 Version
        Random random = new Random();
        int randIndex;
        for(int i = 0; i<cards.size(); i++){
            randIndex = random.nextInt(cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(randIndex));
            cards.set(randIndex,temp);
        }

     */

    public Deck deal(int num){

        Deck dealing = new Deck();
        int thisDeckSize;

        for(int i = 0; i < num; i++){
            thisDeckSize = this.cards.size()-1;
            dealing.cards.add(this.cards.get(thisDeckSize));
            this.cards.remove(thisDeckSize);
        }

        return dealing;
    }



}
