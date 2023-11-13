/*
Q 8.
Write a program to find the index where a given target element should be inserted
in a sorted array to maintain the array's sorted order.
For example, given the input array sortedArray = [1, 3, 5, 6] and the target element
5, the function should return 2, as 5 is already present at index 2. If the target
element is 2, the function should return 1, as inserting 2 at index 1 would maintain
the sorted order.

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


