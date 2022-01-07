package dev.anthonybruno.concurrency.interview.oo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {

    private final List<Card> cards;

    public Deck() {
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
        this.cards = cards;
    }
}
