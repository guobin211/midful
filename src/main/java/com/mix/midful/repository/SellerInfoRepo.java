package com.mix.midful.repository;

import com.mix.midful.document.SellerInfo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * SellerInfoRepo
 *
 * @author guobin211
 * @version 0.0.1
 */
@Repository
public interface SellerInfoRepo extends ReactiveMongoRepository<SellerInfo, String> {
}
