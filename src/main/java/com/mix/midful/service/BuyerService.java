package com.mix.midful.service;

import com.mix.midful.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * BuyerService
 *
 * @author guobin211
 * @version 0.0.1
 */
@Service
@Slf4j
public class BuyerService {

    private final Logger logger = LoggerFactory.getLogger(BuyerService.class);

    /**
     * 查询订单
     * @param openid openid
     * @param orderId 订单id
     * @return 订单信息
     */
    public Mono<OrderDTO> findOrderOne(String openid, String orderId) {
        return null;
    }

    /**
     * 取消订单
     * @param openid openid
     * @param orderId 订单id
     * @return 订单信息
     */
    public Mono<OrderDTO> cancelOrder(String openid, String orderId) {
        return null;
    }
}
