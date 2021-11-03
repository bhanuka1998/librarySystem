package com.assignment.library.librarySystem.model;

import javax.persistence.*;

@Entity
@Table(name = "book_borrowings")
public class BookBorrowings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "b_br_id")
    private Integer bookBorrowingsID;

    @Column(name = "b_borrowed_date")
    private String bookBorrowedDate;

    @Column(name = "b_due_date")
    private String bookReturnDate;

    @Column(name = "status")
    private String status;

    @Column(name = "b_id")
    private Integer bookID;

    @Column(name = "m_id")
    private Integer memberID;

    public Integer getBookBorrowingsID() {
        return bookBorrowingsID;
    }

    public void setBookBorrowingsID(Integer bookBorrowingsID) {
        this.bookBorrowingsID = bookBorrowingsID;
    }

    public String getBookBorrowedDate() {
        return bookBorrowedDate;
    }

    public void setBookBorrowedDate(String bookBorrowedDate) {
        this.bookBorrowedDate = bookBorrowedDate;
    }

    public String getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(String bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
