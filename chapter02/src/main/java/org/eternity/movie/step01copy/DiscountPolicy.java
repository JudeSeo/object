package org.eternity.movie.step01copy;

import org.eternity.money.step01copy.Money;

public interface DiscountPolicy {
    public Money calculateDiscountAmount(Screening screening);
}
