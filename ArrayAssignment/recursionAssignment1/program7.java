//WAP to find a factorial of a number 


import java.util.*;
class RecursionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("factorial of "+num+" is "+factorialOfNumber(num));
	}
	static int factorialOfNumber(int num){
		if (num==0){
			return 1;
		}
		return num*factorialOfNumber(num-1);
	}
}

