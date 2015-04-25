/*
 * $Id: SynchronizedSequence.java 976 2009-04-21 07:59:22Z yqwu $
 * $Revision: 976 $
 */

package com.etonenet.uuid.impl;

/**
 * Synchronized based Sequence
 * 
 * @author Wu Yiqun
 */
public class SynchronizedSequence implements Sequence {

    private int sequence = 0;

    public synchronized int getSequence() {
        return sequence++;
    }

    public synchronized String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SynchronizedSequence:");
        sb.append(sequence);
        return sb.toString();
    }

}
