package com.xiaohuxiong.xor;

/**
 * 异或运算 ： 相同为0，不同为1
 *      无进位相加
 *      0^N == N ,N^N ==0
 *
 */
public class XOR {

    /**
     * 不通过额外变量交换2个 这个是操作不同的内存的，内存是一个的话会有问题
     */
    public void wapA2B(){
        int a = 6;
        int b = 7;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+b);
    }

    /**
     * 数组奇数偶数问题
     * int eor = 0;
     * int eor = eor^arr[i]
     */

    /**
     * arr中有2中数，出现奇数次
     *
     */
    public static void printOddTimesNum(int[] arr){
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor = eor^arr[i];
        }
        // eor = a^b  不等于 0 eor必有一个位置为1
        //提取最右边的1
        int rightOne = eor & (~eor +1);
        int onlyOne = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & onlyOne)!=0){
                rightOne^=arr[i];
            }
        }
        System.out.println(onlyOne +" " + (eor^onlyOne));
    }
}
