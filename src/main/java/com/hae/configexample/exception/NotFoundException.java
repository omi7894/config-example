package com.hae.configexample.exception;

import lombok.Getter;

@Getter
public class NotFoundException extends BizException {
    public NotFoundException(String entityName) {
        super(BizExceptionCode.DataNotFound, "존재하지 않는 " + entityName + " 입니다.");
    }
}
