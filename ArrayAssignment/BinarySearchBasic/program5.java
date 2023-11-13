/*
Q 5.
Implement binary search to find the element closest to a given target in a sorted
array.

For example, given the input array arr = [1, 2, 4, 7, 9] and the target element 6, the
function should return 7, as 7 is the closest element to 6 in the array.
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
		int target= sc.nextInt();
		int start=0;
		int end=arr.length;

	        System.out.println(closestElement(arr,target,start,end)+" is the closest element to the "+target+" int the array");


	}
	static int closestElement(int arr[],int target,int start,int end){
		if(start>end)
			return -1;
		int mid = (start+end)/2;
		if(arr[mid]==target)
			return arr[mid];
		else if(arr[mid]>target)
			if(mid>0 && target-arr[mid-1]<arr[mid]-target)
				return closestElement(arr,target,start,end-1);
		         else
				 return arr[mid];
		else
			if(mid<arr.length-1 && arr[mid+1]-target<target-arr[mid])
				return closestElement(arr,target,mid+1,end);
		        else
				return arr[mid];
	}
}






