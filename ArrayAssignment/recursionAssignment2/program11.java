//Write a program to check if a given number is Harshad number or no (A harshed number is a number that is divisible by the sum of its digits



import java.util.*;
class RecursionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		boolean output = isHarshadNumber(num);
		if (output)
			System.out.println(num+" is Harshad number");
		else
			System.out.println(num+" is not Harshad number ");
	}
	static boolean isHarshadNumber(int num){
		int sum = digitsSum(num);
		if (num%sum==0){
			return true ;
		}
		return false;
	}
	static int digitsSum(int num){
		if (num ==0)
			return 0;
		return (num%10)+digitsSum(num/10);
	}
}

