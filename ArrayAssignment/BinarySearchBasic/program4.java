/*
Q 4. Last Occurrence of an Element
modify the binary search function to find the last occurrence of a given element in
a sorted array.
For instance, given the input array arr = [2, 4, 4, 4, 6, 7, 8] and the target element 4,
the function should return 3, as 4 last appears at index 3 in the array.

*/


import java.util.*;

class BinarySearchProblem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Elements in array");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter key: ");
		int key= sc.nextInt();
		int start =0;
		int end = arr.length;
		
		int lastIndex = lastAppears(arr,key,start,end);
		if(lastIndex == -1)
			System.out.println(key +" is not present in array");
		else
			System.out.println(key+ "last Appers at " +lastIndex);
		
	}
	static int lastAppears(int arr[] , int key , int start, int end){
		if (start>end)
			return -1;
		int mid = (start+end)/2;
		if(arr[mid]==key && (mid == arr.length-1 || arr[mid+1] != key))
				return mid;
		else if(arr[mid]>key)
		                 return lastAppears(arr,key,start ,mid-1);

		else if(arr[mid]<=key)
		                 return lastAppears(arr,key,mid+1,end);
		return -1;
	}
		     
}


