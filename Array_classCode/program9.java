//find the Sum betweenn to index


import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
                System.out.println("First Index  : ");
		int startIndex = Integer.parseInt(br.readLine());
		System.out.println("Second Index  : ");
        int endIndex = Integer.parseInt(br.readLine());		

		System.out.println("Sum Between given  : "+sumBetweenIndex(arr,startIndex,endIndex));
               
	}
	static int sumBetweenIndex(int arr[] , int startIndex,int endIndex){
		int sum =0;
		for(int i=startIndex;i<=endIndex;i++){
			sum=sum+arr[i];
		}
		return sum;
	}

	
}



