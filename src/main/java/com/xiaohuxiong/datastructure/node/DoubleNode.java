package com.xiaohuxiong.datastructure.node;

import java.util.LinkedList;

public class DoubleNode<E> {

    private E element;
    private DoubleNode next;
    private DoubleNode prev;

    public DoubleNode() {
    }

    public DoubleNode(DoubleNode<E> prev, E element, DoubleNode<E> next) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }
}
