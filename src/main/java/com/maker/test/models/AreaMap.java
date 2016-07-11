package com.maker.test.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.expression.spel.ast.FloatLiteral;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by aemmet on 6/29/16.
 */
@Document
public class AreaMap {
    @Id
    private BigInteger id;
    private Image image;
    private List<Area> areas;
    private String notes;
}
