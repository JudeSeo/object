package org.eternity.movie.step01copy;

import org.eternity.money.step01copy.Money;

import java.time.LocalDateTime;

/**
 *
 */
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    // 영화 상영 시작 시간
    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    // 순번의 일치 여부 검사
    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    // 기본 요금
    public Money getMovieFee() {
        return movie.getFee();
    }

    /**
     * 영화를 예매한 후 예매정보를 담고 있는 객체 반환
     * Customer 예먀자 정보, audienceCount 인원 수
      */
    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calulateFee(audienceCount), audienceCount);
    }

    // 전체 예매 요금 계산
    private Money calulateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
