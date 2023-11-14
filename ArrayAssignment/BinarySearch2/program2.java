/*
2. Given an array with a Distinct element, which is formed by rotating
A sorted array K times.
Given an X element.
Find its index of it in the given array.
[Note: K value not given]
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
		System.out.println("Enter the target element:");
		int target = sc.nextInt();
		int start =0;
		int end = arr.length-1;
		int index = searchElement(arr,start,end,target);
		if(index==-1)
			System.out.println(target +" is not present in array");
		else
			System.out.println(target + " is at index "+index);

	}
	static int searchElement(int arr[] , int start, int end , int target){
		if(start>end)
			return -1;
		int mid=(start+end)/2;
		if(arr[mid]==target)
			return mid;
		else if (arr[start]<=arr[mid]){
			if(arr[start]<=target && target <arr[mid])
				return searchElement(arr,start,mid-1,target);
			else
				return searchElement(arr,mid+1,end,target);
		}
		else{
			if (arr[mid]<target && arr[end]>=target)
				return searchElement(arr,mid+1,end,target);
			else
				return searchElement(arr,start,mid-1,target);
		}
	}
}


