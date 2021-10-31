package com.assignment.library.librarySystem.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "b_id")
    private Integer bID;

    @Column(name = "b_name", nullable = false)
    private String bName;

    @Column(name = "ISBN", nullable = false)
    private Integer isbn;

    @Column(name = "b_price", nullable = false)
    private Float bPrice;

    @Column(name = "b_cat_id", nullable = false)
    private Integer bCatId;

    @Column(name = "no_of_copies", nullable = false)
    private Integer noOfCopies;

    public Integer getbID() {
        return bID;
    }

    public void setbID(Integer bID) {
        this.bID = bID;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public Float getbPrice() {
        return bPrice;
    }

    public void setbPrice(Float bPrice) {
        this.bPrice = bPrice;
    }

    public Integer getbCatId() {
        return bCatId;
    }

    public void setbCatId(Integer bCatId) {
        this.bCatId = bCatId;
    }

    public Integer getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(Integer noOfCopies) {
        this.noOfCopies = noOfCopies;
    }
}

