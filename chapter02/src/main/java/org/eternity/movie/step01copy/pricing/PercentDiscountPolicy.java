package org.eternity.movie.step01copy.pricing;

import org.eternity.money.step01copy.Money;
import org.eternity.movie.step01copy.DefaultDiscountPolicy;
import org.eternity.movie.step01copy.DiscountCondition;
import org.eternity.movie.step01copy.Screening;

/**
 * 비율 할인 정책
 * 예매 요금에서 일정 비율 할인
 */
public class PercentDiscountPolicy extends DefaultDiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
