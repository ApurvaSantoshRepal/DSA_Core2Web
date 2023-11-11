//Write a program to print the factorial of given number 
import java.util.*;
class RecursionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int output = factorial(num);
		System.out.println("factorial of "+num +" is "+output);
	}
	static int factorial(int num ){
		if (num==0){
			return 1;
		}
		return num*factorial(num-1);
	}
}

