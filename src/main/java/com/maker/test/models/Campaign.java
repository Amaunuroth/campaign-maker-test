package com.maker.test.models;

import org.springframework.data.annotation.Id;

/**
 * Created by aemmet on 6/29/16.
 */
public class Campaign {
    @Id
    private Long id;

    private String name;
    private Image image;
    private Long owner;
    private String html;

    public String getName() {
        return name;
    }

    public Image getImage() {
        return image;
    }

    public Long getOwner() {
        return owner;
    }

    public String getHtml() {
        return html;
    }
}
