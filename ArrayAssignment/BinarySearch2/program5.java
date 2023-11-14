/*
5. Search for a range
Problem Description :
- Given a sorted array of integers A(0 based index) of size N,
find the starting and the ending position of a given integer B in

array A.
- Return an array of size 2, such that the
first element = starting position of B in A
the second element = ending position of B in A.
- If B is not found in A return [-1, -1].
Problem Constraints :
1 <= N <= 106
1 <= A[i], B <= 109
Input Format :
- The first argument given is the integer array A.
- The second argument given is the integer B.
Example Input :
Input 1:
A = [5, 7, 7, 8, 8, 10]
B = 8

Output 1:
[3, 4]
Input 2:
A = [5, 17, 100, 111]
B = 3
Output 2:
[-1, -1]
Input 3:
A = [3, 5, 7, 9, 11]
B = 7
Output 3:

[2, 2]
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
