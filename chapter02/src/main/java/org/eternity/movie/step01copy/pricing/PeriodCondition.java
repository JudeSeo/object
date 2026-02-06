package org.eternity.movie.step01copy.pricing;

import org.eternity.movie.step01copy.DiscountCondition;
import org.eternity.movie.step01copy.Screening;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * 기간 조건
 * 영화 상영 시작 시간을 이용해 할인 여부 결정
 * 상영 시작 시간이 특정한 기간에 포함되는지 여부 판단하여 할인
 */
public class PeriodCondition implements DiscountCondition {
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
                endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
    }
}
