package com.zero.entity;

import java.io.Serializable;

public class CommonBaseIndentity implements Serializable {

    private static final long serialVersionUID = 5127520050130350217L;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
