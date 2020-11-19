package com.gojek.meetingscheduler.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "RESERVATIONS")
@Data
public class Reservations implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Integer reservationId;

    @Column(name = "room_id")
    private Integer roomId;

    @Column(name = "purpose")
    private String purpose;

    @Column(name = "date_begin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateBegin;

    @Column(name = "date_end")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnd;
}
