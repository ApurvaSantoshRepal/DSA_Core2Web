/*
Q 3. First Occurrence of an Element
Modify the binary search function to find the first occurrence of a given element in
a sorted array. Return -1 if the element is not present.
For example, given the input array arr = [2, 4, 4, 4, 6, 7, 8] and the target element
4, the function should return 1, as 4 first appears at index 1 in the array.

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
		int end=arr.length-1;
		System.out.println("output: "+firstAppears(arr,key,start,end));

	}
	static int firstAppears(int arr[] , int key,int start,int end){
		if(start>end)
			return -1;
		int mid =(start+end)/2;
		if(arr[mid]==key && (mid == 0|| arr[mid-1] !=key))
			return mid;
	        else if(arr[mid]>=key)
		        return firstAppears(arr,key ,start,mid-1);
		else 
			return firstAppears(arr,key,mid+1,end);
	        	
		
	}
}


