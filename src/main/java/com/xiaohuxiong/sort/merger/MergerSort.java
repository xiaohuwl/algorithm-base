package com.xiaohuxiong.sort.merger;

import java.util.ArrayList;
import java.util.List;

/**
 * 归并排序
 */
public class MergerSort {


     //递归归排序
    //通过递归将arr变成2边是有序的 [l,r]上是有序的
    public void sortByRecursion(List<Integer> list,int l,int r){
        if (r == l){
            return;
        }
        int mid = l + ((r-l) >> 1) ;
        sortByRecursion(list,l,mid);
        sortByRecursion(list,mid+1,r);
    }

    //非递归排序
    public void sortByNormal(List<Integer> list){
        int size = list.size();
        if ((size==0)||(size==1)){
            return;
        }
        int mergerSize = 1;
        while (mergerSize < size){
            int l  = 0;
           while (l < size){
               int m = l+mergerSize -1;
               if (m >= size){
                   break;
               }
               int r = Math.min(m + mergerSize, size - 1);
               merger(list,l,m,r);
               l = r+1;
           }
           if (mergerSize > size/2){
               break;
           }
            mergerSize <<= 1;
        }

    }

    public static void merger(List<Integer> list,int l, int mid, int r){
        List<Integer> occup = new ArrayList<>();
        int i = 0;
        int p1 = l;
        int p2 = mid +1;

        while (p1 <= mid && p2 <= r ){
            occup.add(i++,list.get(p1) >= list.get(p2)?list.get(p2++):list.get(p1++));
        }

        while (p1 <= mid){
            occup.add(i++,list.get(p1++));
        }

        while (p2 <= r){
            occup.add(i++,list.get(p2++));
        }
    }


}
