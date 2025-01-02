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
     */
    @PostMapping("/concert/info")
    public ConcertResultDTO getConcertInfo(@RequestBody ConcertRequestDTO concertDTO) throws Exception {
        ConcertResultDTO result = new ConcertResultDTO();
        return result;
    }
}
