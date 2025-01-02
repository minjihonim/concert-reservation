package kr.hhplus.be.server.application.user;

import kr.hhplus.be.server.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 유저 파사드
 */
@Service
@RequiredArgsConstructor
public class UserFacade {

    private final UserService userService;
}
