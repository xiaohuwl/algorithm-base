package com.xiaohuxiong.datastructure.node;

public class DoubleNode<T> {

    private T value;
    private DoubleNode next;
    private DoubleNode pre;

    public DoubleNode() {
    }

    public DoubleNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPre() {
        return pre;
    }

    public void setPre(DoubleNode pre) {
        this.pre = pre;
    }
}
