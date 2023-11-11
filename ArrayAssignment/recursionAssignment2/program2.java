//Write a program to print the product of digits of a given number 
import java.util.*;
class RecursionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int output = productOfDigits(num);
		System.out.println("Product of digits from "+num+" is "+output);
	}
	static int productOfDigits(int num){
		if (num/10==0){
			return num;
		}
		int rem = num%10;
		return rem*productOfDigits(num/10);
	}
}

