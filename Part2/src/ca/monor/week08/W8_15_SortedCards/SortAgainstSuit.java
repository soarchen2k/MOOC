package ca.monor.week08.W8_15_SortedCards;

import java.util.Comparator;

public class SortAgainstSuit implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        return o1.getSuit() - o2.getSuit();
    }
}
