/*
Write a program to check if a given number is a Duck Number or not.
(A Duck Number is a number which doesn't start with a zero but has at least one
digit as zero.)

*/


import java.util.*;
class RecursionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		boolean output=containsZero( num);
		if (output){
			System.out.println(num+" is Duck Number");
		}
		else{
			System.out.println(num+" is not Duck Number");
		}
	}
	static boolean containsZero(int num){
		if (num==0){
			return false;
		}
		if (num%10==0){
			return true;
	        }
		return containsZero(num/10);
	}
}
