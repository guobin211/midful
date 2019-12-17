package com.mix.midful.service;

import com.mix.midful.dto.OrderDTO;
import reactor.core.publisher.Mono;

/**
 * BuyerService
 *
 * @author guobin211
 * @version 0.0.1
 */
interface BuyerService {
    /**
     * 查询单个订单
     * @param openid 用户openid
     * @param orderId 订单id
     * @return Mono<OrderDTO>
     */
    Mono<OrderDTO> findOrderOne(String openid, String orderId);

    /**
     * 取消单个订单
     * @param openid 用户openid
     * @param orderId 订单id
     * @return Mono<OrderDTO>
     */
    Mono<OrderDTO> cancelOrder(String openid, String orderId);
}
