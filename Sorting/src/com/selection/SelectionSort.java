package com.selection;

public class SelectionSort {
int i,j,minI;

public void sSort(int [] arr) {
	int n=arr.length;
	for(i=0;i<n-1;i++) {
		
		minI=i;
		for(j=i+1;j<n;j++) {
			if(arr[j]<arr[minI]) {
			minI=j;
			
			

			}

		}

		int temp=arr[minI];
		arr[minI]=arr[i];
		arr[i]=temp;	
	}

}
}
