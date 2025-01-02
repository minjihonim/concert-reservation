package kr.hhplus.be.server.domain.concert.infrastructure;

import kr.hhplus.be.server.domain.concert.entity.Concert;
import kr.hhplus.be.server.domain.concert.repository.ConcertReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ConcertCoreReaderRepository implements ConcertReaderRepository {

    private final ConcertJpaRepository concertJpaRepository;
    @Override
    public Concert getConcertInfo(long concertId) {
        Optional<Concert> concert = concertJpaRepository.findById(concertId);
        if(concert.isPresent()) {
            return concert.get();
        }
        throw new RuntimeException("콘서트 정보가 존재하지 않습니다.");
    }

    @Override
    public boolean reserveConcert(long concertId, String userId) {
        // TODO: 엔티티 생성
        return false;
    }

    @Override
    public boolean approvePaymentForConcert(String userId, long concertId, long price) {
        // TODO: 엔티티 생성
        return false;
    }
}
