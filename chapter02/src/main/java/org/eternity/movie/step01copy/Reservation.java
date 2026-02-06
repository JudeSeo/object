package org.eternity.movie.step01copy;

import org.eternity.money.step01copy.Money;

/**
 * 예약 클래스는 고객, 상영정보, 예매요금, 인원 수를 속성으로 포함
 */
public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
