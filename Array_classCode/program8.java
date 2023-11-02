//Given an arr calculate the sum of first and last element for middle elements print it as it is



import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Sum");
	        sumOfPair(arr);
	}
	static void sumOfPair(int arr[]){
		int start=0;
		int end=arr.length-1;
		while(start<=end){
			if(start==end){
				System.out.println(arr[start]);
			}
			else{
				System.out.println(arr[start]+arr[end]);
			}
			start++;
			end--;
		}
	}
}




