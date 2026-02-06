package org.eternity.movie.step01copy.pricing;

import org.eternity.money.step01copy.Money;
import org.eternity.movie.step01copy.DiscountPolicy;
import org.eternity.movie.step01copy.Screening;

/**
 * 할인 없음
 */
public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
