package searching;

import java.util.Scanner;

public class LinearSearch {

	public static int Lsearch(int data,int[] arr ) {
		for(int i=0;i<arr.length;i++) {
			 if(arr[i]==data) {
				 return i;
			 }
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array= {20,8,7,6,5,2};
		System.out.println("enter the no to search");
		int target=sc.nextInt();
		
		int result=Lsearch(target, array);
		System.out.println(result);
		
		if(result!=-1) {
			System.out.println("No found in array...");
		}
		else {
			System.out.println("no is not found in array.");
		}
	}
	
}
