// Leftmax (optimized solution)


import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of Array");
		int size = Integer.parseInt(br.readLine());
		System.out.println("Enter Elements in array");
		int arr[]= new int[size];
		for (int i= 0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int leftMax [] = new int [size];
		int max = Integer.MIN_VALUE;
		for (int i=1;i<size;i++){
			if (arr[i]>max){
				max = arr[i];
			}
			leftMax[i]=max;
		}
		System.out.println("Enter Index :");
		int index = Integer.parseInt(br.readLine());
		System.out.println("left max for index "+index+" is "+leftMax[index]);
	}
}
