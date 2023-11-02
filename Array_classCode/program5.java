//Take arr of size N and reverse it with time complexity O(N) and SpaceComplexity O(N)
//

import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int output[] =reverseArray(arr);
		System.out.println("Reverse array is : ");
                for(int i=0;i<size;i++){
			System.out.println(output[i]);
		}
	}
	static int[] reverseArray(int arr[]){
		int temp[]= new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--){
			temp[j++]=arr[i];
		}
		return temp;
	}
}

