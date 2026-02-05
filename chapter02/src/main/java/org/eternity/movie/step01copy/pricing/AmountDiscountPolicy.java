package org.eternity.movie.step01copy.pricing;

import org.eternity.money.step01copy.Money;
import org.eternity.movie.step01copy.DiscountCondition;
import org.eternity.movie.step01copy.DiscountPolicy;
import org.eternity.movie.step01copy.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
