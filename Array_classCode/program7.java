//Find Second Largest Element 


import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Second Largest Element is  : "+secondLargestElement(arr));
                
	}
                 static int secondLargestElement(int arr[]){
                        int firstLargest = Integer.MIN_VALUE;
	                int secondLargest=Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++){
				if(arr[i]>firstLargest){
					secondLargest=firstLargest;
					firstLargest=arr[i];
				}
			}
			return secondLargest;
		 }
                                  
	
}



