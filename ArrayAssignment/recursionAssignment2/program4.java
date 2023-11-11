//Write a program to print the sum of odd numbers up to given number 
import java.util.*;
class RecursionDemo{
	static int sum = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		sumOfOddNumbers(num);
		System.out.println("Sum of odd digits is " + sum );
	}
	static void sumOfOddNumbers(int num){
		if (num==0){
			return;
		}
		int rem = num%10;
		if (rem%2==1){
			sum = sum +rem;
		}
		sumOfOddNumbers(num/10);
	}
}

