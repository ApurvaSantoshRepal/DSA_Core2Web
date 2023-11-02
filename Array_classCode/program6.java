//Reverse an array with time complexity O(N) and Space Complexity O(1)


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
		int start=0;
		int end = arr.length-1;
		while(start<=end){
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;


	}
}



