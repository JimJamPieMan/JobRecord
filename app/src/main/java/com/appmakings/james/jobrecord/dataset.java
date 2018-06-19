package com.appmakings.james.jobrecord;

/**
 * Created by rudla on 8/12/2016.
 */

public class dataset {

    String name;
    String description;
    int id_;

    public dataset(String name, String description, int id_) {
        this.name = name;
        this.description = description;
        this.id_ = id_;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id_;
    }
}
