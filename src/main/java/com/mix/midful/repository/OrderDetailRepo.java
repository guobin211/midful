package com.mix.midful.repository;

import com.mix.midful.document.OrderDetail;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * OrderDetailRepo
 * 订单详情仓库
 * @author guobin211
 * @version 0.0.1
 */
@Repository
public interface OrderDetailRepo extends ReactiveMongoRepository<OrderDetail, String> {
}
