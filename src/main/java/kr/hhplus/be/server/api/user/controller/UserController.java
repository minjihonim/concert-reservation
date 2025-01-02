package kr.hhplus.be.server.api.user.controller;

import kr.hhplus.be.server.api.user.dto.UserRequestDTO;
import kr.hhplus.be.server.api.user.dto.UserResultDTO;
import kr.hhplus.be.server.application.user.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserFacade userFacade;

    /**
     * 유저 잔액 조회 API
     * @param userRequestDTO
     * @return
     * @throws Exception
     */
    @PostMapping("/user/cash/info")
    public UserResultDTO getUserCashInfo(@RequestBody UserRequestDTO userRequestDTO) throws Exception {
        UserResultDTO result = new UserResultDTO();
        return result;
    }

    /**
     * 유저 잔액 충전 API
     */
    @PostMapping("/user/charge/cash")
    public UserResultDTO chargeUserCash(@RequestBody UserRequestDTO userRequestDTO) throws Exception {
        UserResultDTO result = new UserResultDTO();
        return result;
    }

}
