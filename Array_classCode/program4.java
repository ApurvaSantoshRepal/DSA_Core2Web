//Given an array of size N return the count of pairs(i,j) with arr[i]+arr[j]=k
//i != j

import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size =Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter value of K : ");
		int k =Integer.parseInt(br.readLine());
		System.out.println("count pairs :"+countPairs(arr,size,k));
	}
	static int countPairs(int arr[] , int size,int k){
		int count =0;
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(arr[i]+arr[j]==k && i != j){
					count++;
				}
			}
		}
		return count;
	}
}

//Time Complexity O(n^2);
//Space Complexity O(1);
