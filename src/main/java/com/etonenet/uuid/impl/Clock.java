/*
 * $Id: Clock.java 976 2009-04-21 07:59:22Z yqwu $
 * $Revision: 976 $
 */

package com.etonenet.uuid.impl;

import java.util.Date;

/**
 * Clock( ±÷”)
 * 
 * @author Wu Yiqun
 */
public interface Clock {

    /**
     * Get the current time value in milliseconds of the Clock.
     * 
     * @return time value in milliseconds
     */
    public long getTime();

    /**
     * Get java.util.Date from time value in milliseconds.
     * 
     * @param time time value in milliseconds
     * @return Date
     */
    public Date getTime(long time);

}