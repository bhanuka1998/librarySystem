package com.assignment.library.librarySystem.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "video_borrowings")
public class VideoBorrowings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "v_br_id")
    private Integer videoBorrowingsID;

    @Column(name = "v_br_date")
    private  String videoBorrowedDate;

    @Column(name = "v_due_date")
    private String videoReturnDate;

    @Column(name = "status")
    private String status;

    @Column(name = "v_id")
    private Integer videoID;

    @Column(name = "m_id")
    private Integer memberID;

    public Integer getVideoBorrowingsID() {
        return videoBorrowingsID;
    }

    public void setVideoBorrowingsID(Integer videoBorrowingsID) {
        this.videoBorrowingsID = videoBorrowingsID;
    }

    public String getVideoBorrowedDate() {
        return videoBorrowedDate;
    }

    public void setVideoBorrowedDate(String videoBorrowedDate) {
        this.videoBorrowedDate = videoBorrowedDate;
    }

    public String getVideoReturnDate() {
        return videoReturnDate;
    }

    public void setVideoReturnDate(String videoReturnDate) {
        this.videoReturnDate = videoReturnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getVideoID() {
        return videoID;
    }

    public void setVideoID(Integer videoID) {
        this.videoID = videoID;
    }

    public Integer getMemberID() {
        return memberID;
    }

    public void setMemberID(Integer memberID) {
        this.memberID = memberID;
    }
}
