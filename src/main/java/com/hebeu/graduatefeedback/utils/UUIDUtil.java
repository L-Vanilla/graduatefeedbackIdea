package com.hebeu.graduatefeedback.utils;

import java.util.UUID;

public class UUIDUtil {
    /**
     * 生成16位字符串
     *
     * @return
     */
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 16);
        return uuid;
    }

}
