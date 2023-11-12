/*
Q17.
Write a program to calculate and print the sum of the first N triangular numbers.
Take N as input from the user.
*/



import java.util.*;
class RecursionDemo{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int sum = sumOfTriangularNumber(num);
		System.out.println("Sum of "+num+" triangular number is "+sum);
	}
	static int sumOfTriangularNumber(int num){
		if (num==0)
			return 0;
		int tri = (num*(num+1))/2;
		return tri+sumOfTriangularNumber(num-1);
	}
}
