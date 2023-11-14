/*
3. Single Element in Sorted Array
Problem Description :
- Given a sorted array of integers A where every element appears twice
except for one element which appears once, find and return this single element that
appears only once.
Problem Constraints :
1 <= |A| <= 100000
1 <= A[i] <= 10^9
Example Input :
Input 1:
A = [1, 1, 7]
Output 1: 7

Input 2:
A = [2, 3, 3]
Output 2: 2
*/


import java.util.*;
class BinarySearchProblem{
	public static void main(String[] args){
		Scanner sc  = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter Elements in array");
		int arr[]=new int [size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int start=0;
		int end=arr.length-1;

		int number=singleElement(arr,start,end);
		System.out.println("Single Element in array is : "+number);
	}
	static int singleElement(int[] arr,int start,int end){
		if(start == end )
			return arr[start];
		int mid = (start+end)/2;
		if(mid%2==0){
			if(arr[mid]==arr[mid+1])
				return singleElement(arr,mid+2,end);
			else
				return singleElement(arr,start,mid);
		}
		else if (mid % 2 == 1){
			if(arr[mid]==arr[mid-1])
				return singleElement(arr,mid+1,end);
			else
				return singleElement(arr ,start , mid-1);
		}
		else{
			return -1;
		}
}
}


