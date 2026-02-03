package org.eternity.theater.step01copy;

import java.util.ArrayList;
import java.util.List;

/**
 * 관람객은 매표소에서 초대장을 티켓으로 교환하거나 구매해야한다.
 * 매표소에서는 관람객에게 판매할 티켓과 티켓의 판매 금액이 보관되어 있어야 한다.
 * 판매하거나 교환해줄 티켓 목록, 판매 금액
 * getTicket은 맨 첫번째 위치에 저장된 Ticket 반환
 * 판매 금액을 더하거나 빼는 minusAmount, plusAmount
 */
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    public Ticket getTicket() {
        return tickets.remove(0); // 얜 List의 함수인걸 알겠는데...
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
