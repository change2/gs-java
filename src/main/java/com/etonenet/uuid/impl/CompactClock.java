/*
 * $Id: CompactClock.java 976 2009-04-21 07:59:22Z yqwu $
 * $Revision: 976 $
 */

package com.etonenet.uuid.impl;

import java.util.Date;

/**
 * System.currentTimeMillis() based Clock
 * 
 * @author Wu Yiqun
 */
public class CompactClock implements Clock {

    public long getTime() {
        return System.currentTimeMillis();
    }

    public Date getTime(long time) {
        return new Date(time);
    }

    public String toString() {
        return "CompactClock";
    }

}
