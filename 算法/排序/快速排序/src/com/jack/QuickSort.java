package com.jack;

public class QuickSort {
    /**
     * 快速排序
     * 最好的时间复杂度是(nlogn)，最差的是n*n，退化成冒泡
     * 为什么排序算法是不稳定的，比方说有5,3,3,4,3,66,7
     * 经过一趟排序之后，5和3交换，打破了3和之前几个3原本的顺序
     * 所以是不稳定的
     * @param A
     */
    public void quickSort(int[] A){
        sort(A, 0, A.length-1);
    }

    /**
     * 递归
     * @param A
     * @param lo
     * @param hi
     */
    private void sort(int[] A, int lo, int hi){
        if(lo >= hi)return;
        int flag = partition(A, lo, hi);
        sort(A, lo, flag-1);
        sort(A, flag+1, hi);
    }

    /**
     * 每次拿出第一个元素来进行交换，把大于它的数都交换到他的左边
     * 小于他的元素都交换到它的右边
     * @param A
     * @param lo
     * @param hi
     * @return
     */
    private int partition(int[] A, int lo, int hi){
        int i= lo;
        int j = hi + 1;
        int temp = A[lo];
        while(true){
            while(A[++i] < temp){
                if(i == hi) break;
            }
            while(A[--j] > temp){
                if(j == lo) break;
            }
            if(i >= j)break;
            swap(A, i, j);
        }
        swap(A, lo, j);
        return j;
    }

    /**
     * 交换数组的两个元素
     * @param A
     * @param i
     * @param j
     */
    private void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
