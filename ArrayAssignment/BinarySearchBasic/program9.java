/*
Q 9.
You are given a 2D matrix where each row and each column is sorted in ascending
order. Write a program to search in a matrix to determine if a target element is
present in the matrix.
[
[1, 4, 7, 11],
[2, 5, 8, 12],
[3, 6, 9, 16],
[10, 13, 14, 17]
]

target element 5, the function should return true, as 5 is present in the matrix.
*/


import java.util.*;
class BinarySearchProblem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row of array");
		int row = sc.nextInt();
		System.out.println("Enter the col of array");
		int col = sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("Enter Elements in array");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){

			arr[i][j]=sc.nextInt();
		}
		}
		System.out.println("Enter target: ");
		int target= sc.nextInt();
		boolean flag = searchElement(arr,row-1,col-1,target);
		System.out.println(flag);
	}
        static boolean searchElement(int arr[][] , int row , int col,int target){
		if (row<0){
		       return false;
		}
                if (searchInRow(arr,0,col,row,target)){
	         return true;
		}
               else {
                 return searchElement(arr,row-1,col,target);
	       }
	}
        static boolean searchInRow(int arr[][],int start,int col,int row,int target){
		if(start>col)
			return false;
		int mid = (start+col)/2;
		if (arr[row][mid]==target){
			return true;
		}
		else if(arr[row][mid]>target){
			return searchInRow(arr,start,mid-1,row,target);
		}
		else{
			return searchInRow(arr,mid+1,col,row,target);
		}

	}	


}


