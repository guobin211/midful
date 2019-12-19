package com.mix.midful.repository;

import com.mix.midful.document.ProductInfo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * ProductInfoRepo
 *
 * @author guobin211
 * @version 0.0.1
 */
@Repository
public interface ProductInfoRepo extends ReactiveMongoRepository<ProductInfo, String> {
}
