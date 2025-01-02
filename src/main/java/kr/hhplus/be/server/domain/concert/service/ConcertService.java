package kr.hhplus.be.server.domain.concert.service;


import kr.hhplus.be.server.domain.concert.repository.ConcertReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConcertService {
    private final ConcertReaderRepository concertReaderRepository;
}
