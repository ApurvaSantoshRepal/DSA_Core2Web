/*
Q6.
Find the closest number
BasicAccuracy: 27.1%Submissions: 43K+Points: 1
Hiring Challenge for Working Professionals on 10th November.
Apply to 6 Companies through 1 Contest!
banner
Given an array of sorted integers. The task is to find the closest value to the given
number in array. Array may contain duplicate values.
Note: If the difference is same for two values print the value which is greater than
the given number.
Example 1:
Input : Arr[] = {1, 3, 6, 7} and K = 4
Output : 3
Explanation:
We have an array [1, 3, 6, 7] and target is 4.
If we look at the absolute difference of target
with every element of an array we will
get [ |1-4|, |3-4|, |6-4|, |7-4| ].
So, the closest number is 3.
Example 2:
Input : Arr[] = {1, 2, 3, 5, 6, 8, 9}, K = 4
Output : 5
Expected Time Complexity: O(log(N)).

Expected Auxiliary Space: O(1).
Constraints:
1 ≤ N ≤ 105
1 ≤ K ≤ 105
1 ≤ A[i] ≤ 105
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




