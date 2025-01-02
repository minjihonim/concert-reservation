package kr.hhplus.be.server.domain.user.service;

import kr.hhplus.be.server.domain.user.repository.UserReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserReaderRepository userReaderRepository;
}
