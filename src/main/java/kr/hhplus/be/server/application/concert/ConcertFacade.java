package kr.hhplus.be.server.application.concert;

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


}
