//Given an array of size N and Q number of Quaries . Quary contains two parameters that are start and end index print the sum of all elements from index
import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Query:");
		int Q = Integer.parseInt(br.readLine());
		System.out.println("Enter the size of array");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int [size];
		System.out.println("Enter the elements in the array");
		for (int i= 0;i<size;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int i =1;i<=Q;i++){
			System.out.println("Querey no : "+i);
			System.out.println ("Start index(less than end and greater then -1) :" );
			int start = Integer.parseInt(br.readLine());
			System.out.println("End index(greater than start and less that "+size+" : ");
			int end = Integer.parseInt(br.readLine());
			int sum =0;
			for (int j = start ;j<=end ;j++)
			{
				
				sum = arr[j]+sum;
			}
			System.out.println("sum : "+sum);
		}
	}
}

