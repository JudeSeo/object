package org.eternity.theater.step01copy;

/**
 * 판매원은 매표소에서 초대장을 티켓으로 교환해주거나 티켓을 판매하는 역할
 * 본인이 일하는 매표소를 알고있어야 함
 */
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }
}
