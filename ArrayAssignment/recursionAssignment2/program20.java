/*
Q20.
Write a program to determine whether a given positive integer is a Deficient
Number or not. A Deficient Number is a positive integer where the sum of its
proper divisors is less than the number itself.
*/


import java.util.*;
class RecursionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		boolean output = isDeficientNumber(num);
		if(output)
			System.out.println(num+" is Deficient Number");
		else
			System.out.println(num+" is not Deficient Number");
	}
	static boolean isDeficientNumber(int num){
                int temp =1;
		int sum = sumOfDigits(num,temp);
		if(sum<num)
			return true;

		return false;
	}
	static int sumOfDigits(int num , int temp){
		if(temp>num/2)
			return 0;
		int div =0;
		if(num%temp==0)
			div=temp;
		return div+sumOfDigits(num,temp+1);
	}
}

