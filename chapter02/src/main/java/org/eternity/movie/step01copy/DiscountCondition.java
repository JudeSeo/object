package org.eternity.movie.step01copy;

/**
 * 할인 조건
 * 순서 조건과 기간 조건으로 나눌 수 있음.
 */
public interface DiscountCondition {
    /**
     * 인자로 전달된 상영정보가 할인 조건을 만족하는지 검사하는 메서드
     * 조건을 만족하면 DiscountPolicy의 getDiscountAmount 호출
     * @param screening
     * @return
     */
    boolean isSatisfiedBy(Screening screening);
}
