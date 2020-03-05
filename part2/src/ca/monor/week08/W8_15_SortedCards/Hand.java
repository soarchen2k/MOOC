package ca.monor.week08.W8_15_SortedCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cards = new ArrayList<Card>();

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        for (Card c :
                cards) {
            System.out.println(c);
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    public int totalValue() {
        int totalValue = 0;
        for (Card card : cards) {
            totalValue += card.getValue();
        }
        return totalValue;
    }

    public int totalSuit() {
        int totalSuit = 0;
        for (Card card : cards) {
            totalSuit += card.getSuit();
        }
        return totalSuit;
    }

    @Override
    public int compareTo(Hand o) {
//        if (this.totalValue() == o.totalValue()) {
//            return this.totalSuit() - o.totalSuit();
//        }
        return this.totalValue() - o.totalValue();
    }

    public void sortAgainstSuit() {
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
}
