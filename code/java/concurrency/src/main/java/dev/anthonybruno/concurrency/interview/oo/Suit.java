package dev.anthonybruno.concurrency.interview.oo;

public enum Suit {

    CLUBS(Color.BLACK),
    DIAMONDS(Color.RED),
    HEARTS(Color.RED),
    SPADES(Color.BLACK);

    private final Color color;

    Suit(Color color) {
        this.color = color;
    }

}
