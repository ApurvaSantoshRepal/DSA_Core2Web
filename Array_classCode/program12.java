//solve inplace prefix sum 
//example :
//input1[] ={1,2,3,4,5}
//output = {1,3,6,10,15}
import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter the size of array");
		int size = Integer.parseInt(br.readLine());
		System.out.println("Enter Elements in array");
		int arr[] = new int[size];
		for (int i = 0;i<size ;i++){
			arr[i]= Integer.parseInt(br.readLine());
		}
		for (int i =1;i<size;i++){
			arr[i]= arr[i]+arr[i-1];
		}
		for (int i = 0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

