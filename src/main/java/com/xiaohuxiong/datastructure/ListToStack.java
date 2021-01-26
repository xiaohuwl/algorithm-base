package com.xiaohuxiong.datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用数组去实现队列和栈
 */
public class ListToStack<T> {

    private List<T> list = new ArrayList<T>();
    private int pollIndex = 0;
    private int pushIndex = 0;
    private int limt;
    private int size = 0;

    private void init(List list){
        limt=list.size();
        pollIndex=0;
        pushIndex=0;
        size=0;
    }


    public void push(T t){
        if (limt==0){
            return;
        }
        if (size==limt){
            throw new RuntimeException("栈满了");
        }
        size++;
        list.add(pushIndex,t);

        pushIndex = nextIndex(pushIndex);
    }

    public T pop(){
        if (limt==0){
            return null;
        }
        if (pollIndex==0){
            throw new RuntimeException("没数据");
        }
        size--;
        T t = list.get(pollIndex);
        pollIndex = nextIndex(pollIndex);
        return t;
    }

    public int nextIndex(int index){
       return index < limt-1 ? index ++:0;
    }




}
