package org.eternity.movie.step01copy.pricing;

import org.eternity.money.step01copy.Money;
import org.eternity.movie.step01copy.DefaultDiscountPolicy;
import org.eternity.movie.step01copy.DiscountCondition;
import org.eternity.movie.step01copy.Screening;

/**
 * 금액 할인 정책
 * 예매 요금에서 일정 요금 할인
 */
public class AmountDiscountPolicy extends DefaultDiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().minus(discountAmount);
    }
}
