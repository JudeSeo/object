package org.eternity.theater.step01copy;

/**
 * 공연을 관람하기 원하는 모든 사람은 티켓을 가지고 있어야한다.
 * 이벤트 당첨자는 티켓으로 교환 가능한 초대장(Invitation)을 가지고 있을 것이다.
 * 이벤트 미당첨자는 티켓 구매를 위한 현금을 가지고 있을 것이다.
 * 관람객이 가지고 있을 수 있는 소지품은 티켓, 초대장, 현금이다.
 * 관람객이 소지품을 보관할 용도로 가방을 가져올 수 있다고 하자.
 */
public class Ticket {
    private Long fee;

    public Long getFee() {
        return fee;
    }
}
