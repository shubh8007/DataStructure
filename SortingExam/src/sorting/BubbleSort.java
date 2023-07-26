package sorting;

public class BubbleSort {
public static int bubbleSort(int[] arr) {
	
	int i,j,temp;
	for(i=0;i<arr.length;i++) {
		for(j=i+1;j<arr.length; 
				j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return -1;
}
	public static void main(String[] args) {
		int[] array= {20,56,14,78,32,9,6,3};
              
		
		
		System.out.println("Array before sorting..");
		for(int num:array) {
			System.out.print(num+" ");
		}
		System.out.println(" fZ                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
		System.out.println("Array after sorting...");
		bubbleSort(array);
		for(int num:array) {
			System.out.print(num+" ");
		}
	}

}
