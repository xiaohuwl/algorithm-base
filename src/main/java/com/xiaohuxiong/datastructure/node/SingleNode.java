package com.xiaohuxiong.datastructure.node;

/**
 * 单向列表结构
 */
public class SingleNode {
   private String value;
   private SingleNode next;

    public SingleNode() {
    }

    public SingleNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }
}
