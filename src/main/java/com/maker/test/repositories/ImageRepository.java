package com.maker.test.repositories;

import com.maker.test.models.Image;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by aemmet on 7/6/16.
 */
public interface ImageRepository extends MongoRepository<Image, Long> {
}
