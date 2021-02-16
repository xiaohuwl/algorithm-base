package com.xiaohuxiong.datastructure.node;

/**
 * 单向列表结构
 */
public class SingleNode {
   private int hash;
   private SingleNode next;

    public SingleNode() {
    }

    public SingleNode(int hash,SingleNode next) {
        this.hash = hash;
        this.next = next;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }
}
