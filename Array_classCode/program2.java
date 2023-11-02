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
		System.out.println("Count Having atleast 1 element greater than itself is : "+countNumber(arr));
	}
	static int countNumber(int arr[]){
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					count++;
					break;
				}
			}
		}
		return count;
	}
}
//Native approch 
//Time Complexity O(n^2);
//space Complexity O(1);
