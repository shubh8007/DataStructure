package com.quick;

import java.util.Arrays;

public class QuickSort {

	    public static void main(String[] args) {
	        int[] array = {8, 3, 1, 5, 9, 4, 2, 7, 6};
	        System.out.println("Original Array: " + Arrays.toString(array));

	        quickSort(array, 0, array.length - 1);

	        System.out.println("Sorted Array: " + Arrays.toString(array));
	    }

	    public static void quickSort(int[] array, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(array, low, high);
	            quickSort(array, low, pivotIndex - 1);
	            quickSort(array, pivotIndex + 1, high);
	        }
	    }

	    public static int partition(int[] array, int low, int high) {
	        int pivotValue = array[high];
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (array[j] < pivotValue) {
	                i++;
	                swap(array, i, j);
	            }
	        }

	        swap(array, i + 1, high);
	        return i + 1;
	    }

	    public static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	}


