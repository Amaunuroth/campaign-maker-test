package com.maker.test;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import java.util.Collection;

/**
 * Created by aemmet on 7/7/16.
 */
public class CampaignUser extends User  {
    private static final String SALT_AS_TOP_SECRET = "39eromjnfsdif0uerkngrwowfelspc84uvebenfrygb9wihvyfdikgd";
    private static final PasswordEncoder encoder = new StandardPasswordEncoder(
            SALT_AS_TOP_SECRET);

    public static String encrypt(String rawPassword) {
        return encoder.encode(rawPassword);
    }

    public static PasswordEncoder getEncoder()
    {
        return encoder;
    }

    public CampaignUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public String getSalt() {
        return SALT_AS_TOP_SECRET;
    }
}
