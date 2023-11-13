/*
Q2.
Given a sorted array of size N and an integer K, find the position(0-based
indexing) at which K is present in the array using binary search.
Example 1:
Input:
N = 5
arr[] = {1 2 3 4 5}
K = 4
Output: 3
Explanation: 4 appears at index 3.
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
		int end = arr.length-1;
		System.out.println("index: "+binarySearch(arr,key,start,end));

	}
	static int binarySearch(int arr[] , int key , int start, int end){
		if (start>end)
			return -1;
		int mid =(start+end)/2;
		if(arr[mid]==key)
			return mid;
		else if(arr[mid]>key)
			return binarySearch(arr,key,start,mid-1);
		else
			return binarySearch(arr,key,mid+1,end);
	}

}


