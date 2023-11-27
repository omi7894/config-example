package com.hae.configexample.exception;

import org.springframework.http.HttpStatus;

public enum BizExceptionCode implements BaseBizExceptionCode {
    DataNotFound(HttpStatus.NOT_FOUND),
    AlreadyExist(HttpStatus.BAD_REQUEST),
    MustHavePageOption(HttpStatus.BAD_REQUEST),
    OverMaxPageSize(HttpStatus.BAD_REQUEST),
    EncryptionFailed(HttpStatus.BAD_REQUEST),
    DecryptionFailed(HttpStatus.BAD_REQUEST),
    InvalidInputData(HttpStatus.BAD_REQUEST);

    private final HttpStatus httpStatus;

    BizExceptionCode(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
