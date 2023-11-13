/*
Q1.WAP for binary search using recursion as well as while loop approach.
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
		System.out.println("output using while loop:"+binarySearchUsingWhile(arr,key));
		System.out.println("output using recursion : "+binarySearchUsingRecursion(arr,key,start,end));


	}
	static int binarySearchUsingWhile(int arr[] , int key){
		int start =0;
		int end =arr.length-1;
		while(start <end){
			int mid = (start+end)/2;
			if (arr[mid]==key){
				return mid;
			}
			else if(arr[mid]>key){
				end=mid-1;
			}
			else{
				start = mid +1;
			}
		}
		return -1;
	}
	static int binarySearchUsingRecursion(int arr[] , int key,int start,int end){
		if (start>end){
			return -1;
		}
		int mid = (start+end)/2;
		if(arr[mid]==key)
			return mid;
		else if(arr[mid]>key)
			return binarySearchUsingRecursion(arr,key,start,mid-1);
		else
			return binarySearchUsingRecursion(arr,key,mid+1,end);
	}
}


