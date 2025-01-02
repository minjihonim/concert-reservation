package kr.hhplus.be.server.domain.concert.infrastructure;

import kr.hhplus.be.server.domain.concert.entity.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConcertJpaRepository extends JpaRepository<Concert, Long> {

    @Override
    Optional<Concert> findById(Long concertId);
}
