// Given an integer array of Size N 
// Build an array leftmax of size N(use brought fource approch)
// find the leftmax array of i
//Leftmax of i contains the maximum for the index 0 to the index i

import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array");
		int size = Integer.parseInt(br.readLine());
		System.out.println("Enter the elemets in array");
		int arr[] = new int [size] ;
		for (int i = 0;i<size ;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int leftMax[] = new int [size];
		for (int i =0;i<size;i++){
			int max = Integer.MIN_VALUE;
			for (int j=0;j<=i;j++){
				if (arr[j]>max){
					max = arr[j];
				}
			}
			leftMax[i]=max;
		}
		System.out.println("Enter the number of Query");

		int Q = Integer.parseInt(br.readLine());
		for (int i= 1;i<Q;i++){
			
	        System.out.println("Enter the index:");
		int index = Integer.parseInt(br.readLine());
		
		System.out.println(leftMax[index]);
		}


	}
}
