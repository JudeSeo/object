package org.eternity.theater.step01copy;

/**
 * 가방에는 티켓, 초대장, 현금이 있을 수 있다.
 * 초대장의 보유여부를 확인하는 hasInvitation
 * 티켓의 보유여부를 확인하는 hasTicket
 * 현금을 증가 감소 시키는 minusAmount, plusAmount
 * 초대장을 티켓으로 교환하는 setTicket
 *
 * 이벤트에 당첨되었다면 현금과 초대장이 들어있을 수 있고, 미당첨자는 초대장이 없을 것이다.
 * Bag의 상태는 현금+초대장 또는 현금 이 두가지 상태만 가질 수 있다.
 */
public class Bag {
    private Long amount;
    private Ticket ticket;
    private Invitation invitation;

    public Long hold(Ticket ticket){
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
    public boolean hasInvitation() {
        return invitation != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
