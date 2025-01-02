package kr.hhplus.be.server.api.concert.dto;

import lombok.Getter;

/**
 * Concert Request DTO
 */
@Getter
public class ConcertRequestDTO {
    
    // 콘서트 식별자
    private long concertId;

    // 유저 식별자
    private String userId;

    // 콘서트 예약 금액
    private long price;
}
