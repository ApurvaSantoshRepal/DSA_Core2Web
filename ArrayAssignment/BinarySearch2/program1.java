/*

1. Given a sorted array with DISTINCT elements.
Find the floor of no K in the array.
floor => greatest element <= K
input : Arr[2,3,6,9,10,11,14,18];
output :
K = 5 floor = 3
K = 4 floor = 3
K = 6 floor = 6
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
		int floor = floorNumber(arr,start,end,target);
		if(floor==-1)
			System.out.println("No floor number for "+target);
		else
			System.out.println("K = "+target+ " floor = "+floor);

	}
	static int floorNumber(int arr[] , int start , int end , int target){
		if(start>end)
			return -1;
		int mid =(start+end)/2;
		if (arr[mid]==target||(mid==arr.length-1 || (arr[mid]<target && arr[mid+1]>target) )){
			return arr[mid];
		}
		else if (arr[mid]>target)
			return floorNumber(arr,start,mid-1,target);
		else
			return floorNumber(arr,mid+1,end,target);
	}

}


