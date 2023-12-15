//Equlibrium index
//You are give an array A of integer of size N 
//Your task is tto find the equilibrium index of the given array 
//the Equlibrium index of an array is an index such that the sum of element at lower index is equal to the sum of elements at higher indexes 
//If there are no elemnts that are at lower index or at higher indexes then the correspondind sum of elements is considerd as 0
//If there is no equlibrium index then return -1(unoptimized)


import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		System.out.println("Enter size:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		System.out.println("Enter elements");
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int index =-1;
		for(int i =0;i<size;i++){
			int right=0;
			int left= 0;
			
			for (int j=0;j<size;j++){
				if (i>j){
					left = left+arr[j];
				
				}
				else if(i<j){
					right = right+arr[j];
					
				}
                         }
		
			if (left == right){
				index =i;
				break;
			
			}
		}
		System.out.println("equlibrium index : "+index);
	}
}

