package homeworks.homework18;

import java.util.Iterator;
import java.util.LinkedList;

public class Task7 {
    public static void main(String[] args) {
        /*
        Create a Card class that will have interest rate field and card type
        and a constructor that will initialize the fields.
        Create 3 objects of different card and store them into LinkedList.
        Using for loop/advanced for loop/ iterator access all methods of the class.
         */
        Card card1=new Card("Capital one",24.7);
        Card card2=new Card("Chase",27.4);
        Card card3=new Card("Apple",20.5);

        LinkedList<Card> cards=new LinkedList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        for (int i = 0; i < cards.size(); i++) {
            Card card=cards.get(i);
            card.deposit();
            card.withdraw();
        }
        System.out.println("***************************************");

        for(Card card:cards){
            card.deposit();
            card.withdraw();
        }
        System.out.println("***************************************");

        Iterator<Card>iterator=cards.iterator();
        while(iterator.hasNext()){
            Card c=iterator.next();
            c.deposit();
            c.withdraw();
        }
    }
}
class Card {
    String cardType;
    double interestRate;

    public Card(String cardType, double interestRate) {
        this.cardType = cardType;
        this.interestRate = interestRate;
    }

    void deposit(){
        System.out.println("The money has been deposited into your "+cardType+" account and your interest rate is "+interestRate);
    }
    void withdraw(){
        System.out.println("The money has been withdrawn from your "+cardType+" account");
    }
}