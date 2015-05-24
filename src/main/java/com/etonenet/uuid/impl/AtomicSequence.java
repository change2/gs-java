/*
 * $Id: AtomicSequence.java 976 2009-04-21 07:59:22Z yqwu $
 * $Revision: 976 $
 */

package com.etonenet.uuid.impl;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicInteger based Sequence
 * 
 * @author Wu Yiqun
 */
public class AtomicSequence implements Sequence {

    private AtomicInteger sequence = new AtomicInteger(0);

    public int getSequence() {
        return sequence.getAndIncrement();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AtomicSequence:");
        sb.append(sequence.get());
        return sb.toString();
    }

}
