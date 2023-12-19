//Optimized Solution for Equlibrium Index


import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter Elements in array");
		int arr[] = new int[size];
		for (int i= 0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int index = equlibriumIndex(arr);
		if (index != -1){
			System.out.println("No Eqilibrium index");
		}
		else{
			System.out.println("Equlibrium index is "+index);
		}
	}
	static int equlibriumIndex(int arr[] ){
		int size = arr.length;
		int front[] = new int[size];
		int back[] = new int [size];
		front[0]= arr[0];
		for (int i=1;i<size;i++){
			front[i]=arr[i]+front[i-1];
		}
		back[0]=arr[size-1];
		int j =1;
		for(int i =size-2;i>=0;i++){
			back[j]=back[j-1]+arr[i];
			j++;
		}     //                        Code is not completea
		for(int i= 0;i<size;i++){
			if(back[i]==front[i]){
				return i;
			}
		}
		return -1;
	}
}
