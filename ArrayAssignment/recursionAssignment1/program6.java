//WAP to calculate the sum of a given positive integer 


import java.util.*;
class RecursionDemo{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int output =sumOfPositiveInteger(num);
		System.out.println("sum of digits is : "+output);
	}
	static int sumOfPositiveInteger(int num){
		if (num /10 ==0){
			return num;
		}
		int rem = num%10;
		return rem+sumOfPositiveInteger(num/10);
	}
}
