package com.assignment.library.librarySystem.model;

import javax.persistence.*;

@Entity
@Table(name = "book_reservations")
public class BookReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "b_res_id")
    private Integer bookResID;

    @Column(name = "b_id")
    private Integer bookID;

    @Column(name = "m_id")
    private Integer memberID;

    public Integer getBookResID() {
        return bookResID;
    }

    public void setBookResID(Integer bookResID) {
        this.bookResID = bookResID;
    }

    public Integer getBookID() {
        return bookID;
    }

    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }

    public Integer getMemberID() {
        return memberID;
    }

    public void setMemberID(Integer memberID) {
        this.memberID = memberID;
    }
}
