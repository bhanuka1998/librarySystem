package com.assignment.library.librarySystem.model;

import javax.persistence.*;

@Entity
@Table(name = "video_reservations")
public class VideoReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "v_res_id")
    private Integer videoReservationID;

    @Column(name = "v_id")
    private Integer videoID;

    @Column(name = "m_id")
    private Integer memberID;

    public Integer getVideoReservationID() {
        return videoReservationID;
    }

    public void setVideoReservationID(Integer videoReservationID) {
        this.videoReservationID = videoReservationID;
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
