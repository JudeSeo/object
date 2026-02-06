package org.eternity;

import org.eternity.money.step01copy.Money;
import org.eternity.movie.step01copy.Movie;
import org.eternity.movie.step01copy.pricing.AmountDiscountPolicy;
import org.eternity.movie.step01copy.pricing.PercentDiscountPolicy;
import org.eternity.movie.step01copy.pricing.PeriodCondition;
import org.eternity.movie.step01copy.pricing.SequenceCondition;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        Movie avatar = new Movie("Avatar"
                , Duration.ofMinutes(150)
                , Money.wons(12000)
                , new AmountDiscountPolicy(
                Money.wons(2000)
                , new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(12, 0))
                , new PeriodCondition(DayOfWeek.WEDNESDAY, LocalTime.of(18, 0), LocalTime.of(20, 0))
                , new SequenceCondition(10)
                , new SequenceCondition(20)
        ));

        Movie titanic = new Movie("Titanic"
                , Duration.ofMinutes(120)
                , Money.wons(10000)
                , new PercentDiscountPolicy(
                0.2
                , new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(12, 0))
                , new PeriodCondition(DayOfWeek.WEDNESDAY, LocalTime.of(18, 0), LocalTime.of(20, 0))
                , new SequenceCondition(10)
                , new SequenceCondition(20)
        ));
    }
}
