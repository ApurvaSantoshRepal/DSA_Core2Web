/*

Q8.
Magical Number
BasicAccuracy: 40.35%Submissions: 16K+Points: 1
Hiring Challenge for Working Professionals on 10th November.
Apply to 6 Companies through 1 Contest!
banner
Your friend loves magic and he has coined a new term - "Magical number". To
perform his magic, he needs that Magic number. There are N number of people in
the magic show, seated according to their ages in ascending order. A magical
number is that seat no. where the person has the same age as that of the given seat
number.
Help your friend in finding out that "Magical number".
Note: 1. If there are multiple magical numbers in the array, return the any one valid
value.
2. in function low=0 and high=n-1 , where n is length of arr.
Example:
Input:
1
10
-10 -1 0 3 10 11 30 50 100 150

Output:
3
Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N, size of an array.
The second line of each test case contains N input A[].
Output:
Print "Magical Number"
Print "-1" when the index value does not match with the value.
Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 1000
-1000 ≤ A[i] ≤ 1000

*/




import java.util.*;
class BinarySearchProblem{
	public static void main(String[] args){
		Scanner sc  = new Scanner (System.in);
		System.out.println("Enter number of seats in magic show");
		int size = sc.nextInt();
		System.out.println("Enter age of peoples");
		int arr[]=new int [size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int start =0;
		int end = arr.length-1;
		boolean flag = searchMagicSeat(arr,start,end);
		if (flag){
			System.out.println("Magic Number");
		}
		else{
			System.out.println(-1);
		}
	}
	static boolean searchMagicSeat(int arr[] , int start, int end){
		if(start>end)
			return false;
		int mid = (start+end)/2;
		if(arr[mid]==mid)
			return true;
		else if (arr[mid]>mid)
			return searchMagicSeat(arr,start,mid-1);
		else
			return searchMagicSeat(arr,mid+1,end);
	}


}
