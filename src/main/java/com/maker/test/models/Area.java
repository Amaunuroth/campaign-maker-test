package com.maker.test.models;

import org.springframework.data.annotation.Id;

import java.awt.Point;
import java.util.List;

/**
 * Created by aemmet on 6/29/16.
 */
public class Area
{
    private int id;
    private String name;
    private List<Point> points;
    private String url;
}
