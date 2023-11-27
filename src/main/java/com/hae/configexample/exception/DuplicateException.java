package com.hae.configexample.exception;

import lombok.Getter;

@Getter
public class DuplicateException extends BizException {
    public DuplicateException(String entityName) {
        super(BizExceptionCode.AlreadyExist, "중복된 " + entityName + " 입니다." );
    }
}
