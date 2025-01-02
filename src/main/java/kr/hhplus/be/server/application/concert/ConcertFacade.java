package kr.hhplus.be.server.application.concert;

import kr.hhplus.be.server.api.concert.dto.ConcertRequestDTO;
import kr.hhplus.be.server.api.concert.dto.ConcertResultDTO;
import kr.hhplus.be.server.common.token.UserToken;
import kr.hhplus.be.server.domain.concert.service.ConcertService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 콘서트 파사드
 */
@RequiredArgsConstructor
@Service
public class ConcertFacade {
    private final ConcertService concertService;
    private final UserToken userToken;

    /**
     * 콘서트 예약 가능 날짜, 좌석 조회
     * 토큰 발급
     */
    public ConcertResultDTO getConcertInfo(ConcertRequestDTO param) {
        // 토큰 발급
        boolean makeToken = userToken.makeToken();
        if(makeToken) {}

        // 콘서트 정보
        return concertService.getConcertInfo(param);
    }

    /**
     * 콘서트 좌석 예약 요청
     */
    public ConcertResultDTO reserveConcert(ConcertRequestDTO param) {
        // 토큰 체크
        if(checkToken(param.getUserId())) {}

        // 좌석 예약 진행
        return concertService.reserveConcert(param);
    }

    /**
     * 콘서트 결제 요청
     */
    public ConcertResultDTO approvePaymentForConcert(ConcertRequestDTO param) {
        // 토큰 체크
        if(checkToken(param.getUserId())) {}
        return concertService.approvePaymentForConcert(param);
    }

    /**
     * 토큰 체크 (존재여부, 유효한지)
     * @param userId
     * @return
     */
    private boolean checkToken(String userId) {
        return userToken.checkToken(userId);
    }
}
