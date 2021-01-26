package com.xiaohuxiong.datastructure;

import com.xiaohuxiong.datastructure.node.SingleNode;

public class NodeBaseTest {

    public static void main(String[] args) {

    }

    public static SingleNode reverseSingleNode(SingleNode node){
        SingleNode prev = null;
        SingleNode next = null;
        while (node != null) {
            next = node.getNext();
            node.setNext(prev);
            prev = node;
            node=next;
        }

        return prev;
    }

    public static SingleNode removeValue(SingleNode node,String value){
        while (node!=null){
            if (!value.equals(node.getValue())){
                break;
            }
            node=node.getNext();
        }
        SingleNode prev = node;
        SingleNode cur = node;
        while (cur!=null){
            if (value.equals(cur.getValue())){
                cur.setNext(prev.getNext());
            }else {
                prev.setNext(cur);
            }
            cur.getNext();
        }

        return node;
    }
}
