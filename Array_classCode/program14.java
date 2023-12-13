//Find the maximum num till ith index (Without carray Forword approch)
import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array");
		int size = Integer.parseInt(br.readLine());
		System.out.println("Enter the elemets in the array ");
		int arr[] = new int [ size];

		for (int i=0;i<size ;i++){
		arr[i]=Integer.parseInt(br.readLine());
		}
	        System.out.println("Enter the index (-1< index < "+size+")");
	        int index = Integer.parseInt(br.readLine());
		int max = Integer.MIN_VALUE;
		for (int i=0;i<=index;i++){
			if (arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
