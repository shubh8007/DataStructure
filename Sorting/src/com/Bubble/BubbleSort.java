package com.Bubble;

public class BubbleSort {
public void printArr(int arr[]) {
	int n=arr.length;
	int i;
	for(i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
		System.out.print(" ");
	}
	
	
}

public void BubbleSort(int arr[]) {
	int i,j,temp;
	int n=arr.length;
	
	for(i=0;i<n;i++) {
		for(j=i+1;j<n;j++) {
			if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
	}
}
}
