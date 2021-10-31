package com.assignment.library.librarySystem.model;

import org.hibernate.id.IntegralDataTypeHolder;

import javax.persistence.*;

@Entity
@Table(name = "b_category")
public class BookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "b_cat_id")
    private Integer bCatID;

    @Column(name = "b_cat_name", nullable = false)
    private String bCatName;

    public Integer getbCatID() {
        return bCatID;
    }

    public void setbCatID(Integer bCatID) {
        this.bCatID = bCatID;
    }

    public String getbCatName() {
        return bCatName;
    }

    public void setbCatName(String bCatName) {
        this.bCatName = bCatName;
    }
}
