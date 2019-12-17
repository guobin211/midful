package com.mix.midful.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author guobin
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    /*
    * 在架
    * */
    UP(0, "在架"),
    /**
     * 下架
     */
    DOWN(1, "下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
