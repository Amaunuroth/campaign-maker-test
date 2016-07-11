package com.maker.test.repositories;

import com.maker.test.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by aemmet on 7/6/16.
 */
public interface UserRepository extends MongoRepository<User, Long> {
    User findByUsername(String username);
}
