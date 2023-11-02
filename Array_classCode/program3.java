///give an array of size N count the number of elements having atleast 1 element greater than it self
//
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
		System.out.println("Count of numbers Having atleast 1 element greater than itself is : "+countNumber(arr,size));
	}
	static int countNumber(int arr[],int n){
		int countMaxNum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		for(int i=0;i<n;i++){
			if(arr[i]==max){
				countMaxNum++;
			}
		}

		
		return n-countMaxNum;
	}
}
//Optimized approch 
//Time Complexity O(n);
//space Complexity O(1);
