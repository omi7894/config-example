package com.hae.configexample.exception;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class BizException extends RuntimeException {

    @Getter
    private final BaseBizExceptionCode code;
    private String message;
    @Getter
    private String entityName;

    public BizException(BaseBizExceptionCode code) {
        super();
        this.code = code;
    }

    public BizException(BaseBizExceptionCode code, String message) {
        this(code);
        this.message = message;
    }

    public BizException(BaseBizExceptionCode code, String message, Class entityClass) {
        this(code);
        this.message = message;
        this.entityName = entityClass.getSimpleName();
    }

    @Override
    public String getMessage() {
        return "Code:" + code.name() + ", Message:" + message;
    }

    public List<String> getMessages() {
        List<String> msgList = new ArrayList<>();

        if (entityName != null) {
            msgList.add("entity name.".concat(entityName));
        }

        if (message != null) {
            msgList.add("plane text.".concat(message));
        }

        return msgList;
    }

    public String getCodeName() {
        return code.name();
    }
}
