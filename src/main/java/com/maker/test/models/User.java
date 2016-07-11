package com.maker.test.models;

import com.maker.test.CampaignUser;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

/**
 * Created by aemmet on 6/29/16.
 */
@Document
public class User {

    @Id
    private BigInteger id;

    private String username;

    private String password; // TODO: better storage!!!

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = CampaignUser.encrypt(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
