/*
Q18.
Write a program to determine whether a given positive integer is a sad number or
not.
*/

import java.util.*;
class RecursionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		Set<Integer> hs = new HashSet<Integer>();

		boolean output = isSadNumber(num,hs);
		if(output){
			System.out.println(num+" is Sad number");
		}
		else{
			System.out.println(num+" is not Sad number");
		}
	}
	static boolean isSadNumber(int num,Set<Integer>hs){
		if (num==1){
			return false;
		}
		if(!hs.add(num))
			return true;
		int sum = sumOfDigitsSquare(num);
		return isSadNumber(sum,hs);
	}
	static int sumOfDigitsSquare(int num){
		if (num==0)
			return 0;
		int sq = (num%10)*(num%10);
		return sq+sumOfDigitsSquare(num/10);
	}
}


