/*
Q6. Product array puzzle
Problem Description
- Given an array of integers A, find and return the product array of the same
size where the ith element of the product array will be equal to the

product of all the elements divided by the ith element of the array.

- Note: It is always possible to form the product array with integer (32 bit)
values. Solve it without using the division operator.

Constraints
2 <= length of the array <= 1000
1 <= A[i] <= 10
For Example
Input 1:
A = [1, 2, 3, 4, 5]
Output 1:
[120, 60, 40, 30, 24]
Input 2:
A = [5, 1, 10, 1]
Output 2:
[10, 50, 5, 50]
*/

import java.io.*;
class ArraySolution{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int[] output = productArr(arr);
		for(int i= 0;i<output.length;i++){


		System.out.print(output[i]+" ");
		}
		System.out.println();
	}

	static int[] productArr(int arr[]){
		int pArr[] = new int [arr.length];
	        int leftProduct[]=new int[arr.length];
		int rigthProduct[] = new int[arr.length];
		int left = 1;
		int right=1;
		for(int i=0;i<arr.length;i++){
			leftProduct[i]=left;
			left=left*arr[i];
		}
		for(int i=arr.length-1;i>=0;i--){
			rigthProduct[i]=right;
			right=right*arr[i];
		}
		for(int i=0;i<arr.length;i++){
			pArr[i]=leftProduct[i]*rigthProduct[i];
		}
		return pArr;



	}
}

