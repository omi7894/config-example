package com.hae.configexample.util;

import java.util.UUID;

public class CommonUtils {
    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static <T> boolean in(T value, T... list) {
        for (T item : list) {
            if (value.equals(item))
                return true;
        }
        return false;
    }
}
