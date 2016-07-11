package com.maker.test.repositories;

import com.maker.test.models.Encounter;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by aemmet on 7/6/16.
 */
public interface EncounterRepository extends MongoRepository<Encounter, Long> {
}
