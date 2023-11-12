/*
Q19.
Write a program to determine whether a given number is square number or not.
*/


import java.util.*;
class RecursionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=1;
		boolean output = isSquareNumber(num , temp);
		if (output)
			System.out.println(num+" is square number");
		else
			System.out.println(num+" is not square number ");
	}
	static boolean isSquareNumber(int num , int temp){
		int sq =temp*temp;
		if(sq==num)
			return true;
		else if(sq>num)
			return false;
		else
			return isSquareNumber(num,temp+1);
	}
}

