package com.assignment.library.librarySystem.model;

import javax.persistence.*;

@Entity
@Table(name = "videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "v_id")
    private Integer vId;

    @Column(name = "v_name", nullable = false)
    private String vName;

    @Column(name = "v_cat_id", nullable = false)
    private Integer vCatId;

    @Column(name = "v_age_restriction", nullable = false)
    private Integer vAgeRestriction;

    @Column(name = "no_of_copies", nullable = false)
    private Integer noOfCopies;

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public Integer getvCatId() {
        return vCatId;
    }

    public void setvCatId(Integer vCatId) {
        this.vCatId = vCatId;
    }

    public Integer getvAgeRestriction() {
        return vAgeRestriction;
    }

    public void setvAgeRestriction(Integer vAgeRestriction) {
        this.vAgeRestriction = vAgeRestriction;
    }

    public Integer getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(Integer noOfCopies) {
        this.noOfCopies = noOfCopies;
    }
}
