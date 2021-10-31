package com.assignment.library.librarySystem.model;

import javax.persistence.*;

@Entity
@Table(name = "v_category")
public class VideoCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "v_cat_id")
    private Integer vCatID;

    @Column(name = "v_cat_name", nullable = false)
    private String vCatName;

    public Integer getvCatID() {
        return vCatID;
    }

    public void setvCatID(Integer vCatID) {
        this.vCatID = vCatID;
    }

    public String getvCatName() {
        return vCatName;
    }

    public void setvCatName(String vCatName) {
        this.vCatName = vCatName;
    }
}
