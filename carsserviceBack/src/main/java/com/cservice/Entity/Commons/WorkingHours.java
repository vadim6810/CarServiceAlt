package com.cservice.Entity.Commons;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by Oleg on 03.09.2016.
 */
@Embeddable
public class WorkingHours {
    @Temporal(TemporalType.TIME)
    @Column(nullable = false)
    private Date from;

    @Temporal(TemporalType.TIME)
    @Column(nullable = false)
    private Date to;
    private String note;

    public WorkingHours() {
    }

    public WorkingHours( Date from, Date to, String note) {
        this.from = from;
        this.to = to;
        this.note = note;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
