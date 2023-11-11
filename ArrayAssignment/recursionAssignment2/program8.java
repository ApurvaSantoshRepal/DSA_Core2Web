//Write a program to check if a given positive integer is a perfect Number or not 
//(A perfect number is a positive integer that is equal to the sum of its proper divisor , excludind itself)



import java.util.*;
class RecursionDemo{
	static int  sum = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int temp=1;
	        perfectNumber(num,temp);
		if (sum==num){
			System.out.println(num + " is perfect number ");
		}
		else{
			System.out.println(num+" is not a perfect number");
		}
	}
	static void perfectNumber(int num,int temp){
		if(temp*2>num){
			return;
		}
		if (num%temp==0){
			sum = sum +temp;
		}
		perfectNumber(num , temp+1);
	}
}

		

