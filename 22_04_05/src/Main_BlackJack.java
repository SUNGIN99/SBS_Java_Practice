public class Main_BlackJack {

    public static void main(String[] args) {

        Blackjackcard card1 = new Blackjackcard(1,1);
        Blackjackcard card2 = new Blackjackcard(2,6);
        Blackjackcard card3 = new Blackjackcard(4,12);

        System.out.println(card1.getValue());
        System.out.println(card1.isAce());
        System.out.println(card2.getValue());
        System.out.println(card2.isAce());
        System.out.println(card3.getValue());
        System.out.println(card3.isAce());

        /*

        Ace의 경우 1또는 11의 가치를 가짐
        jack, queen, king의 경우 모두 10의 가치를 가짐
        ace, jack, queen, king을 제외한 카드들은 모두 자기자신의 숫자만큼 가치를가짐
         */
    }

}
