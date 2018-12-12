package com.ph.adapter;

public class OpearationAdapter implements ScoreOperation {
    private QuickSort quickSort;
    private BinarySearch binarySearch;
    public OpearationAdapter(){
        quickSort=new QuickSort();
        binarySearch=new BinarySearch();
    }
    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] arr, int key) {
        return binarySearch.binarySearch(arr,key);
    }
}
