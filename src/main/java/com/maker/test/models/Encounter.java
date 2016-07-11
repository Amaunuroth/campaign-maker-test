package com.maker.test.models;

import org.springframework.data.annotation.Id;

/**
 * Created by aemmet on 6/29/16.
 */
public class Encounter {
    @Id
    private Long id;
    private Long owner;
    private String name;
    private String html;
    private String notes;

    public String getName() {
        return name;
    }

    public String getHtml() {
        return html;
    }
}
