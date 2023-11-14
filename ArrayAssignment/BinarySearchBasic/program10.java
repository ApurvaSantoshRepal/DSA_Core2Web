/*
Q 10.
Given a sorted array of integers, find the starting and ending position of a given
target value.
Write a program to find the range of the target element in the array.
For example, given the array [5, 7, 7, 8, 8, 10] and the target element 8, the
function should return [3, 4], as 8 appears at positions 3 and 4 in the array.
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
		System.out.println("Enter target Element: ");
		int target = sc.nextInt();
		int start=0;
		int end = arr.length-1;
		int lastIndex = lastIndexOfTargetElement(arr,start,end,target);
		int firstIndex=firstIndexOfTargetElement(arr,start,end,target);
		System.out.println("["+firstIndex+", "+lastIndex+"]");

	}
	static int lastIndexOfTargetElement(int arr[] , int start , int end , int target){
		if (start>end)
			return -1;
		int mid = (start+end)/2;
		if(arr[mid]==target &&(mid==arr.length-1 || arr[mid+1]!=target))
			return mid;
		else if(arr[mid]>target)
			return lastIndexOfTargetElement(arr,start,mid-1,target);
		else
			return lastIndexOfTargetElement(arr,mid+1,end,target);


	}
	static int firstIndexOfTargetElement(int arr[], int start, int end,int target){
		if(start>end)
			return -1;
		int mid = (start+end)/2;
		if(arr[mid]==target &&(mid==0 || arr[mid-1]<target))
			return mid;
		else if(arr[mid]>=target)
			return firstIndexOfTargetElement(arr,start,mid-1,target);
		else
			return firstIndexOfTargetElement(arr,mid+1,end,target);


	}
}


