//Write a program to check wether the give number is palindrome number or not
//
import java.util.*;
class RecursionDemo{
	static int reverseNo=0;
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		isPalindrome(num);
		if(reverseNo==num){
			System.out.println(num+" is palindrome number ");
		}
		else{
			System.out.println(num + " is not palindrome number ");
		}
	}
	static void isPalindrome(int num){
		if (num==0)
			return;
		int rem= num%10;
		reverseNo=reverseNo*10+rem;
		isPalindrome(num/10);
	}
}

