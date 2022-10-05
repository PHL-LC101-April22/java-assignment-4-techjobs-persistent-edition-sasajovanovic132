package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @Size(min=10,max=200)
private String description;
    public Skill(){}
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}