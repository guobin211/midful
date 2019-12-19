package com.mix.midful.repository;

import com.mix.midful.document.ProductCategory;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * ProductCategoryRepo
 *
 * @author guobin211
 * @version 0.0.1
 */
@Repository
public interface ProductCategoryRepo extends ReactiveMongoRepository<ProductCategory, String> {
}
