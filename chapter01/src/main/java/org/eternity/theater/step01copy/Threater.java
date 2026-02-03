package org.eternity.theater.step01copy;

/**
 * 가방에 초대장이 있는지 확인 후 있으면 티켓과 교환.
 * 없으면 현금으로 티켓 구매 => 매표소에 현금 증가
 */
public class Threater {
    private TicketSeller ticketSeller;

    public Threater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
