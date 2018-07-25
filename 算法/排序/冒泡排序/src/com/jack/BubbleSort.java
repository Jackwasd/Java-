package com.jack;

/**
 * 冒泡排序
 * 改进版的冒泡排序
 * 每次都是后面的两个数开始向前排序，所以是冒泡排序
 * 但是可以加一个标志，只要其中某次不用交换了，那么后面就再也不要交换了
 * 时间复杂度是n*n
 */
public class BubbleSort {
    /**
     * 冒泡排序，这里面加一个flag标志就是为了在某次不需要排序之后就再也不要了
     * @param A
     */
    public void bubbleSort(int[] A){
        boolean flag = true;
        for(int i = 0; i < A.length && flag; i++){
            flag = false;
            for(int j = A.length-1; j > i; j--){
                if(A[j] < A[j-1]){
                    swap(A, i, j);
                    flag = true;
                }
            }
        }
    }

    private void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
