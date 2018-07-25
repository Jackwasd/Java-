package com.jack;

public class ChooseSort {
    /**
     * 选择排序，就是每次将最小的那个数放到前面
     * 时间复杂度还是n*n
     * 不稳定的
     * 5,2,5,1,4 第一次交换5和1，就会出现不稳定的情况
     * @param A
     */
    public void chooseSort(int[] A){
        for(int i = 0; i < A.length; i++){
            int min = i;
            for(int j = i + 1; j < A.length; j++){
                if(A[j] < A[min]){
                    min = j;
                }
            }
            if(min != i){
                swap(A, i, min);
            }
        }
    }
    private void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
