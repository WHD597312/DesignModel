package com.ph.adapter;
public class QuickSort {

    public int[] quickSort(int arr[]){
        sort(arr,0,arr.length-1);
        return arr;
    }
    public void sort(int array[],int p, int r) {
        int q=0;
        if(p<r) {
            q=partition(array,p,r);
            sort(array,p,q-1);
            sort(array,q+1,r);
        }
    }
    public int partition(int arr[],int p,int r){
        int x=arr[r];
        int j=p-1;
        for (int i = p; i <=r-1 ; i++) {
            if (arr[i]<=x){
                j++;
                swap(arr,j,i);
            }
        }
        swap(arr,j+1,r);
        return j+1;
    }
    /***
     * 交换数组中的两个数据
     * @param arr
     * @param i
     * @param j
     */
    public void swap(int arr[],int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
