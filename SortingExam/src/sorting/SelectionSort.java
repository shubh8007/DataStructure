package sorting;

public class SelectionSort {

	public static int sSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			
			int minI=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minI])
				{
				 minI=j;
				}
			}
			int temp=arr[minI];
			arr[minI]=arr[i];
			arr[i]=temp;
			
		}
		
		
		
		
		
		
		return -1;
	}
	public static void main(String[] args) {
		int[] array= {5,9,7,8,2,1};
		System.out.println("Array before sorted");
		for(int num : array) {
			System.out.println(num);
		}

		System.out.println("Array after sorted");
		sSort(array);
		for(int num : array) {
			System.out.print(num);
		}
	}

}
