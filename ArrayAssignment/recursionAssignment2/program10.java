// Write a program to check if given number is an armstrong number or not
//(An Armstrong number is a number that is equal to the sum of its each raised to the power of the number of digits)


import java.util.*;
class RecursionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);

		int num = sc.nextInt();
		int count = countOfDigits(num);
		int output= armstrongNumber(num , count );
                if(output==num){
			System.out.println(num+" is armstrong number ");
		}
		else{
			System.out.println(num+" is not armstrong number");
		}
	}
	static int countOfDigits(int num){
		if (num==0){
			return 0;
		}
		return countOfDigits(num/10)+1;
	}
	static int armstrongNumber(int num , int count ){
		if (num==0){
			return 0;
		}
		return powerOfDigits(num%10,count)+armstrongNumber(num/10,count);
	}
	static int powerOfDigits(int num ,int count ){
		if (count ==0){
			return 1;
		}
		return num*powerOfDigits(num,count-1);
	}
}

