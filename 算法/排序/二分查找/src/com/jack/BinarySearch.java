package com.jack;

/**
 * 二分查找
 */
public class BinarySearch {
    public int binarySearach(int[] A, int key){
        int lo = 0;
        int hi = A.length - 1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(key < A[mid]){
                hi = mid - 1;
            }else if(key == A[mid]){
                return mid;
            }else{
                lo = mid + 1;
            }
        }
        return -1;
    }
}
