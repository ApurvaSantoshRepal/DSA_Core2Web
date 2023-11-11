//Write a program to check if a given number is Abundant Number or not (An Abundant is the sum of al its proper divisor is greater the numbers value)


import java.util.*;
class RecursionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=1;
		int sum = sumofDigits(num,temp);
		if(sum>num){
			System.out.println(num+" is Abundant number");
		}
		else{
			System.out.println(num+" is not Abundant number");
		}
	}
	static int sumofDigits(int num,int temp){
		if (temp*2>num){
			return 0;
		}
		int div = 0;
		if (num%temp==0){
			div = temp;
		}
		return div+sumofDigits(num,temp+1);


	}
}
