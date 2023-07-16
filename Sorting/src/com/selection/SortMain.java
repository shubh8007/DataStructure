package com.selection;

public class SortMain {

	public static void main(String[] args) {
		SelectionSort s1=new SelectionSort();
		
		int [] arr= {45,26,13,78,10,65};
             
		System.out.println("Array is before sorting......");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		
		
		s1.sSort(arr);
		System.out.println(" ");
		System.out.println("Array After Sorting");
		for (int num:arr) {
			System.out.print(num+" ");
		}
	}

}
