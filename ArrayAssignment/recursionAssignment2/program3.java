//Write a program to print maximum digit in the number 
import java.util.*;
class RecursionDemo{
	static int max=Integer.MIN_VALUE;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		maximumNumber(num);
		System.out.println("Maximum Digit from "+num+" is "+max);
	}
	static void maximumNumber(int num){
		if (num==0){
			
			return;
		}
		int rem = num%10;
		if(rem>max){
			max=rem;
		}
		maximumNumber(num/10);
	}
}

