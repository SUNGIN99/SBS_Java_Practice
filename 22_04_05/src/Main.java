public class Main<sout> {

    public static void main(String[] args) {
        Deck standardDeck = new Deck();

        for(int suit = 1 ; suit <= 4; suit++){
            for(int rank = 1; rank <= 13; rank++){
                Card newCard = new Card(suit,rank);

                standardDeck.addCard(newCard);
            }
        }

        standardDeck.shuffle();

        Deck hand1 = standardDeck.deal(5);
        Deck hand2 = standardDeck.deal(5);

        hand1.print();
        System.out.println("----------");
        hand2.print();

    }





}
