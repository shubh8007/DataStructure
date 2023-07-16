package com.Bubble;

public class MainBubbleSort {

	public static void main(String[] args) {
		BubbleSort b1=new BubbleSort();
		
	int	arr[]= {15,12,46,1}; 
	System.out.println("Array is before Sorting....");
	b1.printArr(arr);

	System.out.println("Array is after Sorting...");
	b1.BubbleSort(arr);
	b1.printArr(arr);
	}

}
