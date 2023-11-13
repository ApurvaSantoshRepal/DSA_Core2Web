/*
Q 6.
Modify the binary search to find a peak element in a given array.
For example, in the array [1, 3, 20, 4, 1, 0], 20 is a peak element because it is
greater than its neighbors 3 and 4.
*/





import java.util.*;

class BinarySearchProblem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Elements in array");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
	        int num = peakElement(arr,0,arr.length);
		if(num==-1)
			System.out.println("No peak element in the array");
		else
			System.out.println(num + " is peak element in the array");

	}
	static int peakElement(int arr[] , int start , int end ){
		if (start>end)
			return -1;
		int mid = (start+end)/2;
		if ((mid==0 || arr[mid-1]<arr[mid]) && (mid==arr.length-1 || arr[mid+1]<arr[mid]))
			return arr[mid];
		else if (mid<arr.length-1 && arr[mid]<arr[mid+1])
			return peakElement(arr,mid+1,end);
		else
			return peakElement(arr,start,mid-1);
	}
}


