package com.saleem_siddiqui.java.util.elvis;

import org.junit.Ignore;

import java.util.Date;

/**
 * Created by Saleem Siddiqui on 10/14/12 at 12:46 AM
 */
@Ignore
public class ElvisEvent {
    private final Date finalDate;

    public Date getLatestSightingDate() {
        return finalDate;
    }
    public ElvisEvent(Date date) {
//        this.finalDate = date != null ? date : new GregorianCalendar(1977, Calendar.AUGUST, 16).getTime();
        this.finalDate = date;
    }
}