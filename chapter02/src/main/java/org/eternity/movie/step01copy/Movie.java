package org.eternity.movie.step01copy;

import org.eternity.money.step01copy.Money;

import java.time.Duration;

/**
 * 영화 클래스는 제목, 상영시간, 기본요금, 할인정책을 속성으로 가진다.
 * 해당 값들은 생성자를 통해 전달 받는다.
 */
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    /**
     * discountPolicy에 메세지를 전송해 할인 요금을 전달 받음
     * 어떤 할인 정책인지는 추상화로 구현
     * @param screening
     * @return
     */
    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

    public void changeDiscountPolicy(DiscountPolicy discountPolicy){
        this.discountPolicy=discountPolicy;
    }
}
