// prefix sum array 


import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array");

		int size = Integer.parseInt(br.readLine());
		int arr[] = new int [size];
		System.out.println("Enter the elements in array");
		for (int i =0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int prefixArray[] = new int [size];
		prefixArray[0]=arr[0];
		for(int i =1;i<size;i++){

			prefixArray[i]=prefixArray[i-1]+arr[i];
		}

		System.out.println("Enter no of query:");
		int q = Integer.parseInt(br.readLine());
		for (int i = 1;i<=q;i++){
			System.out.println("Enter start index:");
			int start = Integer.parseInt(br.readLine());
			System.out.println("Enter end index:");
			int end = Integer.parseInt(br.readLine());
			if (start == 0){
				System.out.println(prefixArray[end]);
			}
			else{
				System.out.println(prefixArray[end]-prefixArray[start-1]);
			}
		}
	}
}


