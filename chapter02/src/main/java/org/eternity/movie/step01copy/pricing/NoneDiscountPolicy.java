package org.eternity.movie.step01copy.pricing;

import org.eternity.money.step01copy.Money;
import org.eternity.movie.step01copy.DiscountPolicy;
import org.eternity.movie.step01copy.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
