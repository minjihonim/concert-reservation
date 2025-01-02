package kr.hhplus.be.server.domain.concert.repository;

import kr.hhplus.be.server.api.concert.dto.ConcertRequestDTO;
import kr.hhplus.be.server.domain.concert.entity.Concert;

public interface ConcertReaderRepository {

    Concert getConcertInfo(long concertId);


    boolean reserveConcert(long concertId, String userId);

    boolean approvePaymentForConcert(String userId, long concertId, long price);
}
