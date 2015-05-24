/*
 * $Id: DecimalIdImpl.java 976 2009-04-21 07:59:22Z yqwu $
 * $Revision: 976 $
 */

package com.etonenet.uuid.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ʮ����UUID��ʵ��.
 * 
 * 9999999999990000000 time
 * 0000000000009900000 node
 * 0000000000000099999 sequence
 * 
 * @author Wu Yiqun
 */
public class DecimalIdImpl extends AbstractIdImpl {

    private static final int TIME_DIGITS = 10000000;

    private static final int NODE_DIGITS = 100;

    private static final int SEQUENCE_DIGITS = 100000;

    private Logger logger = LoggerFactory.getLogger(DecimalIdImpl.class);

    public DecimalIdImpl() {
    }

    public void init() {
        if (clock == null) {
            clock = new CompactClock();
        }
        if (node == null) {
            node = new RandomNode();
        }
        if (sequence == null) {
            sequence = new AtomicSequence();
        }
        logger.info("{} initialized", this);
    }

    public long getId() {
        long nodeValue = node.getNode() % NODE_DIGITS;
        nodeValue = (nodeValue < 0) ? (nodeValue + NODE_DIGITS) : nodeValue;
        long sequenceValue = sequence.getSequence() % SEQUENCE_DIGITS;
        sequenceValue = (sequenceValue < 0) ? (sequenceValue + SEQUENCE_DIGITS) : sequenceValue;
        long id = ((clock.getTime() / 1000) * TIME_DIGITS) + (nodeValue * SEQUENCE_DIGITS) + sequenceValue;
        return id;
    }

    public Date getTime(long id) {
        return clock.getTime((id / TIME_DIGITS) * 1000);
    }

    public int getNode(long id) {
        return (int) ((id / SEQUENCE_DIGITS) % NODE_DIGITS);
    }

    public int getSequence(long id) {
        return (int) (id % SEQUENCE_DIGITS);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[DecimalIdImpl [");
        sb.append(super.toString());
        sb.append("]]");
        return sb.toString();
    }

  public static void main(String[] args) {
    DecimalIdImpl idService = new DecimalIdImpl();
    idService.init();

    for (int i = 0; i <200001; i++) {
      System.out.println(idService.getId());
    }
  }

}