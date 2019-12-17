package com.mix.midful.vo;

import lombok.Data;

/**
 * ResultVO
 * http请求返回的最外层对象
 * @author guobin211
 * @version 0.0.1
 */
@Data
public class ResultVO<T> {
    /**
     * 状态码
     */
    Integer code;
    /**
     * 提示信息
     */
    String msg;
    /** 具体内容. */
    T data;
}
