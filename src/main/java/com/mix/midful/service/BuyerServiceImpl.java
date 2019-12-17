package com.mix.midful.service;

import com.mix.midful.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * BuyerServiceImpl
 *
 * @author guobin211
 * @version 0.0.1
 */
@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {

    @Override
    public Mono<OrderDTO> findOrderOne(String openid, String orderId) {
        return null;
    }

    @Override
    public Mono<OrderDTO> cancelOrder(String openid, String orderId) {
        return null;
    }
}
