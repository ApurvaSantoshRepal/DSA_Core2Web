/*
4. Sorted Insert Position
Problem Description :
- Given a sorted array A of size N and a target value B, return the
index
(0-based indexing) if the target is found.
- If not, return the index where it would be if it were inserted in
order.

NOTE:
- You may assume no duplicates in the array.
Problem Constraints :
1 <= N <= 106
Example Input :
Input 1:
A = [1, 3, 5, 6]
B = 5
Output 1: 2
Input 2 :
A = [1, 3, 5, 7]
B = 6
Output 2 : 3
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
		int target= sc.nextInt();
		int start=0;
		int end=arr.length-1;
		int position = correctIndexForTargetElement(arr,start,end,target);
		System.out.println("correct position of "+ target + " is "+position);

	}
	static int correctIndexForTargetElement(int arr[] , int start, int end , int target){
		if(start>end){
			return 0;
		}
		int mid = (start+end)/2;
		if (arr[mid]==target||((mid==0 || arr[mid-1]<target) && arr[mid]>target)||(mid==arr.length-1 && arr[mid]<target))
			return mid;
		else if(arr[mid]>target)
			return correctIndexForTargetElement(arr,start,mid-1,target);
		else
			return correctIndexForTargetElement(arr,mid+1,end,target);
	}


}





