package org.eternity.theater.step01copy;

/**
 * 관람객은 소지품을 보관하기 위한 가방을 가지고 있을 수 있다.
 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
