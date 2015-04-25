/*
 * $Id: AbstractIdImpl.java 976 2009-04-21 07:59:22Z yqwu $
 * $Revision: 976 $
 */

package com.etonenet.uuid.impl;

import com.etonenet.uuid.IdService;

/**
 * UUID的骨干实现.
 * 
 * @author Wu Yiqun
 */
public abstract class AbstractIdImpl implements IdService {

    protected Clock clock = null;

    protected Node node = null;

    protected Sequence sequence = null;

    public AbstractIdImpl() {
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    public String getString(long id) {
        StringBuilder sb = new StringBuilder();
        sb.append("[Time:");
        sb.append(getTime(id));
        sb.append(" Node:");
        sb.append(getNode(id));
        sb.append(" Sequence:");
        sb.append(getSequence(id));
        sb.append("]");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(clock);
        sb.append(' ');
        sb.append(node);
        sb.append(' ');
        sb.append(sequence);
        return sb.toString();
    }

}