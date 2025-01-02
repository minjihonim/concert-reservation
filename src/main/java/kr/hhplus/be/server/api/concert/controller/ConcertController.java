package kr.hhplus.be.server.api.concert.controller;


import kr.hhplus.be.server.api.concert.dto.ConcertRequestDTO;
import kr.hhplus.be.server.api.concert.dto.ConcertResultDTO;
import kr.hhplus.be.server.application.concert.ConcertFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConcertController {

    private final ConcertFacade concertFacade;

    /**
     * 콘서트 예약 가능 날짜, 좌석 조회 API
     * 대기열 토큰 발급
     */
    @PostMapping("/concert/info")
    public ConcertResultDTO getConcertInfo(@RequestBody ConcertRequestDTO param) throws Exception {
        return concertFacade.getConcertInfo(param);
    }

    /**
     * 콘서트 좌석 예약 요청
     */
    @PostMapping("/concert/reservation")
    public ConcertResultDTO reserveConcert(@RequestBody ConcertRequestDTO param) throws Exception {
        return concertFacade.reserveConcert(param);
    }

    /**
     * 콘서트 결제 요청 API
     */
    @PostMapping("/concert/payment/approval")
    public ConcertResultDTO approvePaymentForConcert(@RequestBody ConcertRequestDTO param) throws Exception {
        return concertFacade.approvePaymentForConcert(param);
    }
}
