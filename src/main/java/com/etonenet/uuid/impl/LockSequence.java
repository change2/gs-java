/*
 * $Id: LockSequence.java 976 2009-04-21 07:59:22Z yqwu $
 * $Revision: 976 $
 */

package com.etonenet.uuid.impl;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock based Sequence
 * 
 * @author Wu Yiqun
 */
public class LockSequence implements Sequence {

    private int sequence = 0;

    private ReentrantLock lock = new ReentrantLock();

    public int getSequence() {
        lock.lock();
        try {
            return sequence++;
        } finally {
            lock.unlock();
        }
    }

    public String toString() {
        lock.lock();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("LockSequence:");
            sb.append(sequence);
            return sb.toString();
        } finally {
            lock.unlock();
        }
    }

}
