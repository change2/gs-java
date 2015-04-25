/*
 * $Id: RandomNode.java 976 2009-04-21 07:59:22Z yqwu $
 * $Revision: 976 $
 */

package com.etonenet.uuid.impl;

import java.util.Random;

/**
 * Random initialized Node
 * 
 * @author Wu Yiqun
 */
public class RandomNode implements Node {

    private int node = 0;

    public RandomNode() {
        node = generateRandom();
    }

    public RandomNode(int nodeValue) {
        if (nodeValue == 0) {
            node = generateRandom();
        } else {
            node = nodeValue;
        }
    }

    public int getNode() {
        return node;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RandomNode:");
        sb.append(node);
        return sb.toString();
    }

    private int generateRandom() {
        Random r = new Random(System.currentTimeMillis());
        return r.nextInt();
    }

}
