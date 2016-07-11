package com.maker.test;

import com.maker.test.models.User;
import com.maker.test.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by aemmet on 7/6/16.
 */
@Service
public class DatabaseLoader {
    @Autowired
    private AreaMapRepository areaMapRepository;
    @Autowired
    private CampaignRepository campaignRepository;
    @Autowired
    private EncounterRepository encounterRepository;
    @Autowired
    private ImageRepository imageRepository;
    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    private void initDatabase()
    {
        areaMapRepository.deleteAll();
        campaignRepository.deleteAll();
        encounterRepository.deleteAll();
        imageRepository.deleteAll();
        userRepository.deleteAll();

        User user = new User();
        user.setUsername("aemmet");
        user.setPassword("1337hax");
        userRepository.save(user);
    }
}
