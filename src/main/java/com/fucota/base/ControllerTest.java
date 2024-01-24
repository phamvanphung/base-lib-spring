package com.fucota.base;

import com.fucota.base.core.enums.CommonResponseCode;
import com.fucota.base.core.exception.BusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @GetMapping("/test")
    ResponseEntity<String> test() {
        throw new BusinessException(CommonResponseCode.ACCESS_DENIED);
    }
}