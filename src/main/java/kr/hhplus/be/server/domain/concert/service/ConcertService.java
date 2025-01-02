package kr.hhplus.be.server.domain.concert.service;


import kr.hhplus.be.server.api.concert.dto.ConcertRequestDTO;
import kr.hhplus.be.server.api.concert.dto.ConcertResultDTO;
import kr.hhplus.be.server.domain.concert.entity.Concert;
import kr.hhplus.be.server.domain.concert.repository.ConcertReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConcertService {
    private final ConcertReaderRepository concertReaderRepository;

    /**
     * 콘서트 예약 가능 날짜, 좌석 조회
     */
    public ConcertResultDTO getConcertInfo(ConcertRequestDTO param) {
        ConcertResultDTO result = new ConcertResultDTO();

        // repo
        Concert concertInfo = new Concert();
        concertInfo = concertReaderRepository.getConcertInfo(param.getConcertId());

        // result DTO

        return result;
    }

    /**
     * 콘서트 좌석 예약 요청
     */
    public ConcertResultDTO reserveConcert(ConcertRequestDTO param) {
        ConcertResultDTO result = new ConcertResultDTO();

        // repo
        boolean reserve = concertReaderRepository.reserveConcert(param.getConcertId(), param.getUserId());

        // result DTO
        return result;
    }

    /**
     * 콘서트 결제 요청
     */
    public ConcertResultDTO approvePaymentForConcert(ConcertRequestDTO param) {
        ConcertResultDTO result = new ConcertResultDTO();
        // TODO: 보유 금액 확인 로직

        // repo
        boolean payment = concertReaderRepository.approvePaymentForConcert(param.getUserId(), param.getConcertId(),
                param.getPrice());

        // result DTO
        return result;

    }
}
