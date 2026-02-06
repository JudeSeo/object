package org.eternity.movie.step01copy;

import org.eternity.money.step01copy.Money;

/**
 * 할인 정책
 * 금액 할인 정책과 비율 할인 정책으로 나눌 수 있다.
 */
public interface DiscountPolicy {
    public Money calculateDiscountAmount(Screening screening);
}
