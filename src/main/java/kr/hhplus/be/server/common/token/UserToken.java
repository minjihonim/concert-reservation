package kr.hhplus.be.server.common.token;

import org.springframework.context.annotation.Configuration;

/**
 * 유저별 토큰 생성
 */
@Configuration
public class UserToken {
    /**
     * 토큰 생성
     * @return
     */
    public boolean makeToken() {
        return true;
    }

    public boolean checkToken(String userId) {
        return true;
    }
}
