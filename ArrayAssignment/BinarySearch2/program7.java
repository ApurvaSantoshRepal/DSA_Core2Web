/*
7.
Find the Highest number
EasyAccuracy: 46.89%Submissions: 37K+Points: 2
Hiring Challenge for Working Professionals on 10th November.
Apply to 6 Companies through 1 Contest!
banner
Given an array in such a way that the elements stored in array are in increasing
order initially and then after reaching to a peak element, the elements stored are in
decreasing order. Find the highest element.
Note: A[i] != A[i+1]
Example 1:
Input:
11
1 2 3 4 5 6 5 4 3 2 1
Output: 6
Explanation: Highest element is 6.
Example 2:
Input:
5
1 2 3 4 5
Output: 5
Explanation: Highest element is 5.

Expected Time Complexity: O(log(n))
Expected Space Complexity: O(1)

Constraints:
2 <= Size of array <= 200
1 <= Elements of the array <= 1000000
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
	}
}


