/*
Q 7.
Given a sorted binary array consisting of only 0s and 1s, write a program to count
the number of 1s in the array using binary search.
For example, given the input array arr = [0, 0, 1, 1, 1, 1, 1], the function should
return 5 as there are five occurrences of the digit 1 in the array.

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
	        int startIndexOf1= count1s(arr,0,arr.length-1);
		if (startIndexOf1==0){

		System.out.println("Count of 1 in array is 0 ");
		}
		else{
			System.out.println("Count of 1 in array is " + (arr.length-startIndexOf1));
		}

	}
	static int count1s(int arr[] , int start , int end ){
		if(start>end)
			return 0;
		int mid = (start+end)/2;
		if (arr[mid]==1 &&(mid==0 || arr[mid-1]==0)){
			return mid;
		}
		if(arr[mid]==0)
			return count1s(arr , mid+1,end);
		else
			return count1s(arr,start ,mid-1);
	}
}


