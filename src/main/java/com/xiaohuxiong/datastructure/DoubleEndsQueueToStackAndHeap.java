package com.xiaohuxiong.datastructure;

import com.xiaohuxiong.datastructure.node.DoubleNode;

/**
 * 利用双向列表模拟堆栈
 * @param <T>
 */
public class DoubleEndsQueueToStackAndHeap<T> {

    private DoubleNode<T> head;
    private DoubleNode<T> tail;


    /**
     * 模拟栈
     *  压栈
     * @param value
     */
    public void addFromHead(T value){
        DoubleNode<T> cur = new DoubleNode<T>();
        if (head==null){
            head=cur;
            tail=cur;
        }else {
            cur.setNext(head);
            tail.setNext(cur);
            head.setPre(cur);
        }
    }

    /**
     * 模拟栈
     *  弹栈
     * @param
     */
    public T popFromBottom(){
        if (tail==null){
            return null;
        }
        DoubleNode<T> node = tail;
        if (tail == head){
            tail = null;
            head = null;
        }else {
            tail = node.getPre();
            head.setPre(tail);
            tail.setNext(head);
        }
        return node.getValue();
    }


    /**
     *
     *
     * @return
     */
    public T popFromHead(){
        if (head==null){
            return  null;
        }
        DoubleNode<T> node = head;
        if (head==tail){
            head=null;
            tail=null;
        }else {
            tail.setNext(node);
            head=node.getNext();
            head.setPre(tail);
        }
        return node.getValue();
    }

    /**
     *
     *
     */
    public void addFromBottom(T value){
        DoubleNode<T> cur = new DoubleNode<T>();
        if (tail==null){
            tail=cur;
            head=cur;
        }else{
            cur.setPre(tail);
            cur.setNext(head);
            tail=cur;
        }
    }
}
