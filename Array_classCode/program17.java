//write a code for rigthmax (optimized)

import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array");
		int size  = Integer.parseInt(br.readLine());
		System.out.println("Enter Elements in array ");
		int arr[] = new int [size];
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int rightMax[]= new int [size];
                int max = Integer.MIN_VALUE;
		for(int i = size-1;i>=0;i--){
			if (arr[i]>max){
				max=arr[i];
			}
			rightMax[i]=max;


		}

		System.out.println("Enter index :");
		int index = Integer.parseInt(br.readLine());
		System.out.println("Right max for "+index + " is "+rightMax[index]);
		




	}
}
