package com.jack;

/**
 * 归并排序,所需的时间复杂度是nlogn
 * 缺点是所需要的辅助空间和数组的长度是一样的
 * 归并排序是稳定的
 */
public class MergeSort {
    //辅助空间
    private int[] tempArray;

    public void mergeSort(int[] A){
        tempArray = new int[A.length];
        sort(A, 0, A.length-1);
    }

    private void sort(int[] A, int lo, int hi){
        if(lo >= hi) return;
        int mid = (hi-lo) / 2;
        sort(A, lo, mid);
        sort(A, mid+1, hi);
        merge(A, lo, mid, hi);
    }

    /**
     * 将数组进行归并，相对较小的归到左边，较大的归到右边
     * @param A
     * @param lo
     * @param mid
     * @param hi
     */
    private void merge(int[] A, int lo, int mid, int hi){
        int i = lo;
        int j = mid + 1;
        for(int k = lo; k <= hi; k++){
            tempArray[k] = A[k];
        }
        //将左右两部分归并起来
        for(int k = lo; k <= hi; k++){
            if(i > mid){
               A[k] = tempArray[j++];
            }else if(j > hi){
                A[k] = tempArray[i++];
            }else if(tempArray[i] > tempArray[j]){
                A[k] = tempArray[j++];
            }else{
                A[k] = tempArray[i++];
            }
        }
    }
}
