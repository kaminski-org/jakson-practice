package com.json.jackson.annotations.readannotations;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PersonAutoDetect {
    private long id = 123;
    public String name = "Dariusz";
}
