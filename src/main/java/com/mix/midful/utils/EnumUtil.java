package com.mix.midful.utils;

import com.mix.midful.enums.CodeEnum;

/**
 * 枚举工具类
 * @author guobin
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
