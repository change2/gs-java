/*
 * $Id: HexIdImpl.java 976 2009-04-21 07:59:22Z yqwu $
 * $Revision: 976 $
 */

package com.etonenet.uuid.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ʮ�����UUID��ʵ��.
 * 
 * 0x7FFFFFFF00000000 time
 * 0x00000000FF000000 node
 * 0x0000000000FFFFFF sequence
 * 
 * @author Wu Yiqun
 */
public class HexIdImpl extends AbstractIdImpl {

    private Logger logger = LoggerFactory.getLogger(HexIdImpl.class);

    public HexIdImpl() {
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
        long id = ((clock.getTime() / 1000) << 32) + ((node.getNode() & 0xFF) << 24) + (sequence.getSequence() & 0xFFFFFF);
        return id;
    }

    public Date getTime(long id) {
        return clock.getTime((id >> 32) * 1000);
    }

    public int getNode(long id) {
        return (int) ((id >> 24) & 0xFF);
    }

    public int getSequence(long id) {
        return (int) (id & 0xFFFFFF);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[HexIdImpl [");
        sb.append(super.toString());
        sb.append("]]");
        return sb.toString();
    }

  public static void main(String[] args) {
    HexIdImpl idService = new HexIdImpl();
    idService.init();

    for (int i = 0; i <1000001; i++) {
      System.out.println(idService.getId());
    }
  }

}