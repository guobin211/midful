package com.mix.midful.repository;

import com.mix.midful.document.OrderMaster;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * OrderMasterRepo
 *
 * @author guobin211
 * @version 0.0.1
 */
@Repository
public interface OrderMasterRepo extends ReactiveMongoRepository<OrderMaster, String> {
}
