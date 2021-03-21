package com.xiaohuxiong.sort.merger;

public class MergerSortByOnline {

    public static void mergeSort(int[] arr){

        if(arr == null || arr.length < 2)
            return;
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int l, int r) {
        //终止条件
        if(l == r)
            return;
        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);//拆分左半部分
        mergeSort(arr, mid + 1, r);//拆分右半部分
        merge(arr, l, mid, r);//每次拆分完之后就合并，合并的都是有序的数组，所以比较块
    }

    //合并的方法有点类似于连个有序链表的合并过程
    private static void merge(int[] arr, int l, int mid, int r) {

        int[] help = new int[r - l + 1];//创建一个辅助数组
        int i = 0;
        int p1 = l;//做部分指针
        int p2 = mid +1;//右部分指针
        while(p1 <=mid && p2 <= r)
        {
            help[i++] = arr[p1] < arr[p2]? arr[p1++] : arr[p2++];
        }
        //两个while循环用来处理剩余部分，必定只执行一个
        while(p1 <= mid)
            help[i++] = arr[p1++];
        while(p2 <= r)
            help[i++] = arr[p2++];
        for(int j = 0; j < help.length; j++)//合并成功的部分整理到原数组
            arr[l + j] = help[j];
    }

    public static int[] generateRandomArray(int maxSize, int maxValue){

        int[] arr = new int[(int)((maxSize + 1) * Math.random())];//Math.random()产生的是一个[0,1)随机数
        for(int i = 0; i < arr.length; i++)
            arr[i] = (int)(((maxValue + 1) * Math.random()) - ((maxValue + 1) * Math.random()));
        return arr;
    }
    public static void main(String[] args) {
	/*	int[] arr = {1,6,3,2,8,0,9};
		mergeSort(arr);
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);*/
        int[] arr = generateRandomArray(20, 16);
        mergeSort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }

}
