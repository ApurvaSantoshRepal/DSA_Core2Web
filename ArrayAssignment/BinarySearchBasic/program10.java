/*
Q 10.
Given a sorted array of integers, find the starting and ending position of a given
target value.
Write a program to find the range of the target element in the array.
For example, given the array [5, 7, 7, 8, 8, 10] and the target element 8, the
function should return [3, 4], as 8 appears at positions 3 and 4 in the array.
*/


import java.util.*
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
	}
}


