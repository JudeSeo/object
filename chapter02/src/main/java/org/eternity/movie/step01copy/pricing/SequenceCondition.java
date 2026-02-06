package org.eternity.movie.step01copy.pricing;

import org.eternity.movie.step01copy.DiscountCondition;
import org.eternity.movie.step01copy.Screening;

/**
 * 순서 조건
 * 상영 순번을 이용해 할인 여부를 결정
 */
public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
