package com.maker.test.repositories;

import com.maker.test.models.AreaMap;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by aemmet on 7/6/16.
 */
public interface AreaMapRepository extends MongoRepository<AreaMap, Long> {
}
