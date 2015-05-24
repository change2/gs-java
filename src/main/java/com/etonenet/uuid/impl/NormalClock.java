/*
 * $Id: NormalClock.java 976 2009-04-21 07:59:22Z yqwu $
 * $Revision: 976 $
 */

package com.etonenet.uuid.impl;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar based Clock. (yyMMddHHmmssSSS)
 * 
 * @author Wu Yiqun
 */
public class NormalClock implements Clock {

    public long getTime() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR) - 2000;
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        int millisecond = c.get(Calendar.MILLISECOND);
        long time = (((((year * 100L + month) * 100L + date) * 100L + hour) * 100L + minute) * 100L + second) * 1000L + millisecond;
        return time;
    }

    public Date getTime(long time) {
        Calendar c = Calendar.getInstance();
        int millisecond = (int) (time % 1000);
        time /= 1000;
        int second = (int) (time % 100);
        time /= 100;
        int minute = (int) (time % 100);
        time /= 100;
        int hour = (int) (time % 100);
        time /= 100;
        int date = (int) (time % 100);
        time /= 100;
        int month = (int) (time % 100) - 1;
        time /= 100;
        int year = (int) (time % 100) + 2000;
        c.set(year, month, date, hour, minute, second);
        c.set(Calendar.MILLISECOND, millisecond);
        return c.getTime();
    }

    public String toString() {
        return "NormalClock";
    }

}
