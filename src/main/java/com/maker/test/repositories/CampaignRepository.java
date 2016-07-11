package com.maker.test.repositories;

import com.maker.test.models.Campaign;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by aemmet on 7/5/16.
 */
public interface CampaignRepository extends MongoRepository<Campaign, Long> {

}
