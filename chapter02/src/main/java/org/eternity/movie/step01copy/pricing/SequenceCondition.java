package org.eternity.movie.step01copy.pricing;

import org.eternity.movie.step01copy.DiscountCondition;
import org.eternity.movie.step01copy.Screening;

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
