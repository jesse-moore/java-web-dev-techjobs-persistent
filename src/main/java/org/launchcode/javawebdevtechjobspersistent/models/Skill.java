package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max=500)
    private String description;

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void getDescription(String description) {
        this.description = description;
    }
}